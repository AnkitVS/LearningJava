package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter an rate: ");
        double interest = input.nextDouble() / 100;
        System.out.print("Enter an number of years: ");
        int years = input.nextInt();
        double amount = principal * Math.pow(( 1 + interest), years);
        System.out.println("Compound interest: " + (amount - principal));

    }
}
