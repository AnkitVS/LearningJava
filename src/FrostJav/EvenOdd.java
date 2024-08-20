package FrostJav;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.nextInt()%2==0) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
