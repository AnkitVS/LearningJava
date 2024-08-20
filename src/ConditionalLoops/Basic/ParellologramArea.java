package ConditionalLoops.Basic;

import java.util.Scanner;

public class ParellologramArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base and height of Parellologram: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = base * height;
        System.out.println("The area of the parellologram is " + area);
    }
}
