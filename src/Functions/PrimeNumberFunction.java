package Functions;

import java.util.Scanner;

public class PrimeNumberFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        primeNumber(num);
    }
    public static void primeNumber(int num) {
        int i=2,c=0;
        while(i <= num/2 ){
            if(num%i==0){
                c++;
            }
            i++;
        }if(c==0){
            System.out.println(num +" is Prime Number");
        }else{
            System.out.println(num +" is not Prime Number");
        }
    }
}
