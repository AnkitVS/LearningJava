import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(true) {
            char choice = input.next().charAt(0);
            if(choice == '+' || choice == '-' || choice == '*' || choice == '/' || choice == '%') {
                System.out.println("Enter two numbers");
                int a = input.nextInt();
                 int b = input.nextInt();

                switch (choice) {
                    case '+' -> System.out.println(a + b);
                    case '-' -> System.out.println(a - b);
                    case '*' -> System.out.println(a * b);
                    case '/' -> System.out.println(a / b);
                    case '%' -> System.out.println(a % b);
                    default -> System.out.println("Wrong choice");
                }
            }
            if(choice == 'x' || choice == 'X') {
                System.out.println("Stopped");break;
            }
        }
    }
}
