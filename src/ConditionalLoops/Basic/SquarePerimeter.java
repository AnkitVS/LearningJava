package ConditionalLoops.Basic;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double perimeter = side * side;
        System.out.println("The perimeter is: " + perimeter);
    }
}
