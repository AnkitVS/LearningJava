package ConditionalLoops.Basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int max=0, num;
        do{
            num = input.nextInt();
            if(num>max){
                max = num;
            }
        }while(num != 0);
        System.out.println(max);
    }
}
