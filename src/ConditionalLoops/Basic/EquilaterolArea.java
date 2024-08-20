package ConditionalLoops.Basic;

import java.util.Scanner;

public class EquilaterolArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        double side = input.nextDouble();
        double area = (Math.sqrt(3)/4) * side * side;
        System.out.println("The area of the equilateral triangle is " + area);
    }
}
