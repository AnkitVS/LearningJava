package Sorting;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a = {8, 7, 1, 10, 17, 15, 18, 11, 16, 9, 19, 12, 5, 14, 3, 4, 2, 13, 18, 18};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(findDuplicate(a));
    }

    public static int findDuplicate(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]!=i+1){
                int c= a[i]-1;
                if(a[c]!=a[i]){
                swap(a,i,c);
                }
                else {
                    return a[i];
                }
            }else
                i++;
        }
        return -1;
    }

    public static void sort(int[] a){
        for(int i=0;i<a.length;){
            int c = a[i];
            if(a[i]!=a[c]){
                swap(a,i,c);
            }
            else
                i++;
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
