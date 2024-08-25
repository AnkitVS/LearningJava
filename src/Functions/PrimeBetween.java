package Functions;

import java.util.Scanner;

public class PrimeBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter a number: ");
        int b = input.nextInt();
        prime(a,b);
    }
    public static void prime(int a, int b) {
        for(int i=a;i<=b;i++){
            int c=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    c++;
                }
            }if(c==0){
                System.out.println(i);
            }
        }
    }
}
