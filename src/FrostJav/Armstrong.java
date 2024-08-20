package FrostJav;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num = input.nextInt();
        int num2 = input.nextInt();
        if (num != num2) {
            int temp = num, temp2 = num2;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit *digit;
                num /= 10;
            }
            if (sum == temp){
                System.out.println(temp + "Armstrong number");
            }else {
                while (num2 != 0) {
                    int digit = num2 % 10;
                    sum += digit * digit *digit;
                    num2 /= 10;
                }
                if (sum == temp2){
                    System.out.println(temp2 + "Armstrong number");
                }
            }
        }
        System.out.println("Both are not Armstrong numbers");
    }
}
