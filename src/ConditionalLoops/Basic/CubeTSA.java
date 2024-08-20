package ConditionalLoops.Basic;

import java.util.Scanner;

public class CubeTSA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the cube : ");
        double size = input.nextDouble();
        double area = 6 * size*size;
        System.out.println("The total surface area of the cube is " + area);
    }
}
