package ConditionalLoops.Basic;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();
        double perimeter = length + width + height;
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}
