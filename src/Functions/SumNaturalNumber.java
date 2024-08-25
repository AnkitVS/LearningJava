package Functions;

import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        sum(num);
    }
    public static void sum(int num) {
        System.out.println( num * (num+1)/2);

    }
}
