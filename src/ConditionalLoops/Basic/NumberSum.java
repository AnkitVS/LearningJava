package ConditionalLoops.Basic;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum = 0,num;
        do {
            num = input.nextInt();
            sum +=num;
        }while(num != 0);
        System.out.println("The sum of the numbers is: " + sum);
    }
}
