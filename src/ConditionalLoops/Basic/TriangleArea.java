package ConditionalLoops.Basic;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        double area = (side*length)/2;
        System.out.println("The area of the triangle is "+area);
    }
}
