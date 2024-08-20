package ConditionalLoops.Basic;

import java.util.Scanner;

public class EqiTrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the triangle: ");
        double length = input.nextDouble();
        double perimeter = 3 * length;
        System.out.println("The perimeter of the triangle is " + perimeter);
    }
}
