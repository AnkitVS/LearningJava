package Functions;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        largest(num1,num2);
        smallest(num1,num2);
    }
    public static void largest(int num1, int num2) {
        if(num1 > num2){
            System.out.println(num1 + " is larger than " + num2);
        }else if(num2 > num1){
            System.out.println(num2 +" is larger than " + num1);
        }else{
            System.out.println("Both are the same");
        }
    }
    public static void smallest(int num1, int num2) {
        if(num1 > num2){
            System.out.println(num2 + " is smaller than " + num1);
        }else if(num2 > num1){
            System.out.println(num1 + " is smaller than " + num2);
        }else{
            System.out.println("Both are the same");
        }
    }
}
