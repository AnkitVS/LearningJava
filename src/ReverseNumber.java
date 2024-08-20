import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber*10 +  number % 10;
            number /= 10;
        }

        System.out.println(reverseNumber);
    }
}
