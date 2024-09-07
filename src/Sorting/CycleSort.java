package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {8, 15, 3, 17, 6, 1, 19, 12, 14, 4, 11, 16, 9, 18, 10, 7, 2, 13, 5};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int correctIndex=arr[i]-1;
            while(arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
                correctIndex=arr[i]-1;
            }
        }
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
                // Recheck the new value at `i` after swap
            } else {
                i++; // Move to the next index if the current index is correctly placed
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}


