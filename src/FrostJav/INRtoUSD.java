package FrostJav;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in INR");
        double amount = sc.nextDouble();
        System.out.println("The USD amount is " + amount*80);
    }
}
