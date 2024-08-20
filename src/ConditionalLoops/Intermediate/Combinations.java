package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        System.out.print("Enter the items to choose: ");
        int r = input.nextInt();

        double numerator = 1, denominator = 1;
        for (int i = 1; i <= r; i++) {
            numerator *= (n - i +1);
            denominator *= i;
        }
        double result = numerator / denominator;
        System.out.println("The combinations are: " + result);
    }
}
