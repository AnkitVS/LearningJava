package ConditionalLoops.Basic;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();
        double volume = 4/3 * Math.PI * radius * radius * radius;
        System.out.println("The area of the sphere is " + volume);
    }
}
