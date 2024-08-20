import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int find = input.nextInt();
        int c=0,i=0;
        while (num > 0) {
            int n = num%10;
            if(n==find){
                c++;
            }
            System.out.println(i++);
            num = num/10;
        }
        System.out.println(c);
    }
}
