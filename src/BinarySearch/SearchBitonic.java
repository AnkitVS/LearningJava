package BinarySearch;

import java.util.Scanner;

public class SearchBitonic {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to search: ");
    int number = input.nextInt();
    int[] array = {1,2,3,4,5,3,1};
    int pos = binarySearch(0,peakNumber(array),number,array);
    if(pos!=-1) {
        System.out.println("Element found at index " + pos);
    }
    else if (pos == -1) {
        System.out.println("Element found at index " + binarySearch(peakNumber(array),array.length-1,number,array));
    }
}

    public static int peakNumber(int[] array) {
        int start = 0,end = array.length-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(array[mid] < array[mid+1]) {
                start = mid + 1;
            } else{
                end = mid;
            }
        }
        return start;
    }
    public static int binarySearch(int start,int end, int num,int[] arr) {
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
                return mid;
            }
        }
        return -1;
    }
}
