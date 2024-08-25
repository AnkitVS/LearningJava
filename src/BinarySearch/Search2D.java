package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int number = input.nextInt();
        int[][] arr = {{1, 2, 3}, {5, 7, 9}, {10, 14, 18}};
        System.out.println(Arrays.toString(binary2D(arr, number)));
    }

    public static int[] binary2D(int[][] arr, int number) {
        int r = 0, c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (number == arr[r][c])
            {
                return new int[] {r,c};
            }
            else if (number < arr[r][c]) {
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] binary2DRow(int[][] arr, int number) {
        int r = 0, c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (number == arr[r][c])
            {
                return new int[] {r,c};
            }
            else if (number < arr[r][c]) {
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
