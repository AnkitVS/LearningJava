package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int k = arr.length-1-i;
            int t=findMax(arr,k);
            swap(arr, t, k);
            }
    }

    public static int findMax(int[] arr, int end) {
        int min = 0;
        for (int i=0;i<=end;i++) {
            if (arr[i] > arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void swap(int[] arr, int i, int j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
