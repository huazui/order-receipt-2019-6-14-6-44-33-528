package org.katas.refactoring;

import java.util.List;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 */
public class OrderReceipt {
    private Order order;
public void appendOutput(StringBuilder output,LineItem lineItem){
    output.append(lineItem.getDescription());
    output.append('\t');
    output.append(lineItem.getPrice());
    output.append('\t');
    output.append(lineItem.getQuantity());
    output.append('\t');
    output.append(lineItem.totalAmount());
    output.append('\n');
}
    public OrderReceipt(Order o) {
        this.order = o;
    }
    public double[] lineItem(StringBuilder output,double totSalesTx,double tot){
        for (LineItem lineItem : order.getLineItems()) {
           appendOutput(output,lineItem);

            // calculate sales tax @ rate of 10%
            double salesRate = .10;
            double salesTax = lineItem.totalAmount() *salesRate;
            totSalesTx += salesTax;
            tot += lineItem.totalAmount() + salesTax;
        }
        double[]array=new double[2];
        array[0]=totSalesTx;
        array[1]=tot;
        return array;
    }
    public void printCustomer(StringBuilder output){
        output.append("======Printing Orders======\n");

        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
    }
    public String printReceipt() {
        StringBuilder output = new StringBuilder();

       printCustomer(output);
//
        double totSalesTx = 0d;
        double tot = 0d;
        double array[]=lineItem(output,totSalesTx,tot);
        output.append("Sales Tax").append('\t').append(array[0]);
        output.append("Total Amount").append('\t').append(array[1]);
        return output.toString();
    }
}