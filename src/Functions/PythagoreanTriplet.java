package Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();
        triplet(a,b,c);
    }
    public static void triplet(int a, int b, int c) {
        if (a*a == b*b + c*c || b*b == c*b + a*a || c*c == a*a + b*b) {
            System.out.println("Triplet found");
        }else{
            System.out.println("Not a triplet");
        }
    }
}
