package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int number = input.nextInt();
        System.out.println(binarySearch(number));
    }
    public static int binarySearch(int number) {
        int[] array = {1,2,29,30,40,58,64,74,77,78,89,90};
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int middle = (start+end) / 2;
            if(array[middle] == number) {
                return middle;
            }
            else if(array[middle] > number) {
                end = middle - 1;
            } else if (array[middle] < number) {
                start = middle + 1;
            }
        }
        return -1;
        }
}
