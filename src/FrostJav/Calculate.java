package FrostJav;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number: ");
        int num = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter your choice:");
        char choice = input.next().charAt(0);
        if (choice == '-') {
            System.out.println(num - num2);
        } else if (choice == '+') {
            System.out.println(num + num2);
        } else if (choice == '*') {
            System.out.println(num * num2);
        } else if (choice == '/') {
            System.out.println(num / num2);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
