package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            System.out.println("Enter number " + i + ": ");
            int num2 = input.nextInt();
            sum += num2;
        }
        System.out.println("The average number is : " + sum/num);
    }
}
