package ConditionalLoops.Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        System.out.print("Fibonacci series : ");
        int i =0 , j =1 , c=0;
        while(c <=  n){
            System.out.print(i + " ");
            int t=i;
            i=j;
            j=t+j;
            c++;
        }
    }
}
