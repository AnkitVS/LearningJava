package ConditionalLoops.Basic;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of two diagnols : ");
        double diagonal = input.nextDouble();
        double diagonal2 = input.nextDouble();
        double area = (diagonal * diagonal2)/2;

        System.out.println("The area of the Rhombus is : " + area);
    }
}
