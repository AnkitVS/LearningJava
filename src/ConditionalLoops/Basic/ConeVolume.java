package ConditionalLoops.Basic;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        double radius = input.nextDouble();
        System.out.println("Enter the height of cone: ");
        double height = input.nextDouble();
        double volume = 1/3 * Math.PI * radius * radius * height;
        System.out.println("The volume of the cone is " + volume);
    }
}
