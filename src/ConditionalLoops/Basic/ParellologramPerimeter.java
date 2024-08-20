package ConditionalLoops.Basic;

import java.util.Scanner;

public class ParellologramPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the paragraph");
        int length = input.nextInt();
        System.out.println("Enter the width of the paragraph");
        int width = input.nextInt();
        double perimeter = 2 + (length + width);
        System.out.println("The perimeter of the paragraph is " + perimeter);
    }
}
