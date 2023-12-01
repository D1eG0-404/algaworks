package Modulo04;

import ch.qos.logback.core.joran.conditional.IfAction;

import java.util.Scanner;

public class ShippingDiscount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This software checks whether the purchase is more than one hundred euro.");
        double result;
        double result2;
        double MinimumToDiscount = 100.00;
        double shippingValue = 15.00;

        System.out.println("Please enter the value of the product: ");
        double valueProduct = scanner.nextDouble();
        System.out.println("Please enter the quantity of the product");
        int quantityProduct = scanner.nextInt();
        result = valueProduct*quantityProduct;

        if (result <= MinimumToDiscount) {
            result2 = result+shippingValue;
            System.out.println("The value of your purchase is "+result);
            System.out.println("If you go ahead with this purchase, 15.00 Euro has been added to your purchase. \n" +
                    "Only purchases over 100.00 Euro get free shipping. The final amount is: " +result2);
        }else {
            System.out.println("The transport is free");
        }
        scanner.close();
    }
}