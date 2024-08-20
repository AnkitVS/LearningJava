package ConditionalLoops.Basic;

import java.util.Scanner;

public class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the rhombus perimeter: ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the rhombus is " + perimeter);
    }
}
