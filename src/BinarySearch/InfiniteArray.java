package BinarySearch;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no to search:");
        int n = input.nextInt();
        search(n);
    }
    public static void search(int target) {
        int[] array = {4,6,7,8,10,27,39,40,53,63};
        int start = 0,end = 1;
        while (target > array[end]) {
            int temp = end+1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        System.out.println("The target is " + binarySearch(array,start,end,target));
    }
    public static int binarySearch(int[] array, int start, int end, int target) {
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(target<array[mid]) {
                end = mid - 1;
            }else if(target>array[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
