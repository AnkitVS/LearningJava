package Functions;

import java.util.Scanner;

public class PalindromeFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        palindrome(num);
    }
    public static void palindrome(int num) {
        int temp = num,rev=0;
        while (num>0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if (temp==rev){
            System.out.println(temp + " is a palindrome");
        }else{
            System.out.println(temp + " is not a palindrome");
        }
    }
}
