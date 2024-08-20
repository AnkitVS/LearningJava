package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        System.out.println("Enter no of items:");
        int r = input.nextInt();
        int numerator = 1;
        for (int i = n; i > n-r; i--) {
            numerator *= i;
        }
        System.out.println("Number of permutations: " + numerator);
    }
}
