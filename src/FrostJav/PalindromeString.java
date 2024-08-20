package FrostJav;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev ="";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        if (rev.equals(s)) {
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not a Palindrome String");
        }
    }
}
