package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price : ");
        double price = input.nextDouble();
        System.out.println("Enter the discount : ");
        double discount = input.nextDouble();
        System.out.println("The discount is " + (discount * price)/100);
    }
}
