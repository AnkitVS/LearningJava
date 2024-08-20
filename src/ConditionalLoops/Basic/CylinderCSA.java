package ConditionalLoops.Basic;

import java.util.Scanner;

public class CylinderCSA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        double area = 2 * Math.PI * radius * height;
        System.out.println("The Curved Surface Area of the cylinder is " + area);

    }
}
