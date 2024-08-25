package BinarySearch;

import java.util.Scanner;

public class MountainPeak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,1};
        peakNumber(array);
    }
    public static void peakNumber(int[] array) {
        int start = 0,end = array.length-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(array[mid] < array[mid+1]) {
                start = mid + 1;
            } else{
                end = mid;
            }
        }
        System.out.println(start);
    }
}
