package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int newNum = 0, temp = num;
        while (num > 0) {
            newNum = newNum* 10 + num % 10;
            num /= 10;
        }
        if(newNum == temp){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It is not a palindrome." + newNum);
        }
    }
}
