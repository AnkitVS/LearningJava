package Functions;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        circleArea(radius);
        circumference(radius);
    }
    public static void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
    public static void circumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is " + circumference);
    }
}
