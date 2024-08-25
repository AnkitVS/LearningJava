package Functions;

import java.util.Scanner;

public class EligibleVoter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of the voter: ");
        int age = input.nextInt();
        eligibleVoter(age);
    }
    public static void eligibleVoter(int age) {
        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        }else{
            System.out.println("You are not eligible for voting.");
        }
    }
}
