package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(Arrays.toString(findFloor(num)));
    }
    public static int[] findFloor(int num) {
        int[] arr = {23,45,54,65,73,87,99,123,456,678};
        int end = arr.length-1,start = 0;
        boolean ord = (arr[end] > arr[start]);
        while(start <= end) {
            int mid = (start+(end-start)/2);
            if(arr[mid] < num) {
                if(ord) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
            else if(arr[mid] > num){
                if(ord) {
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            } else if (arr[mid] == num) {
                return new int[] {arr[mid],mid+1};
            }
        }
        return new int[] {arr[end],end+1};
    }
}
