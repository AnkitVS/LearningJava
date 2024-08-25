package Functions;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num = input.nextInt();
        int num2 = input.nextInt();
        sum(num,num2);
    }
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}
