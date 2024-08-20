package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class PointsDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first point: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter the second point: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("The distance between the two points is: " + distance);

    }
}
