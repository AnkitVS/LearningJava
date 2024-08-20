package FrostJav;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements ");
        int num = input.nextInt();
        int num2 = input.nextInt();

        if(num > num2){
            System.out.println(num);
        } else if (num2 > num) {
            System.out.println(num2);
        }else{
            System.out.println("Both are equal");
        }
    }
}
