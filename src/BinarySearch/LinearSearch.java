package BinarySearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to search: ");
        String search = input.nextLine();
        if(stringSearch(search)){
            System.out.println("The string found." + search);
        }else{
            System.out.println("The string does not exist.");
        }

        System.out.print("Enter a number to search: ");
        int searchNum = input.nextInt();
        if(number2DSearch(searchNum)){
            System.out.println("The number found.");
        }else{
            System.out.println("The number does not exist.");
        }
    }

    static boolean stringSearch(String search) {
        String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "January", "February"};
        for (String s : monthsOfYear) {
            if (search.equals(s)) {
                return true;
            }
        }
        return false;
    }
    static boolean number2DSearch(int searchNum) {
        int[][] array = {
                {34, 19, 67, 82},
                {91, 13, 75},
                {46, 28, 11, 49},
                {25, 98, 11},
                {17, 62, 85, 31, 49}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (searchNum == array[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
