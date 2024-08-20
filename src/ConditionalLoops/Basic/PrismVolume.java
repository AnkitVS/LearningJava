package ConditionalLoops.Basic;

import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base area: ");
        double baseArea = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        double volume = baseArea*height;
        System.out.println("The volume of a circle is " + volume);
    }
}
