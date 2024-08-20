package ConditionalLoops.Basic;

import java.util.Scanner;

public class CirclePreimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
