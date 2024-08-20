package ConditionalLoops.Basic;

import java.util.Scanner;

public class RectngleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
