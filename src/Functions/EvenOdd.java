package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        evenOdd(num);
    }
    public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}
