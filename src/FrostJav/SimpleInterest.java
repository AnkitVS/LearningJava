package FrostJav;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of years: ");
        int years = input.nextInt();
        System.out.print("Enter an amount of months: ");
        int months = input.nextInt();
        System.out.print("Enter an amount of days: ");
        int days = input.nextInt();
        double total = years * months * days;
        System.out.println("Total amount: " + total);
    }
}
