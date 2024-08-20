package ConditionalLoops.Basic;

import java.util.Scanner;

public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = input.nextInt();
        int sum = 0, product = 1;
        while(a>0){
            int remainder = a%10;
            sum += remainder;
            product *= remainder;
        }
        System.out.println("The result is" + (product - sum));
    }
}
