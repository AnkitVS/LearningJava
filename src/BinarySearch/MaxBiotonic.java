package BinarySearch;

import java.util.Scanner;

public class MaxBiotonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(searchBitonic());
    }
    private static int searchBitonic() {
        int[] arr = {1,2,3,1};
        int end = arr.length-1, start = 0;
        while (start < end) {
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]) {
                end = mid;
            }else if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }else{
                start = mid;
            }
        }
        return arr[start];
    }
}
