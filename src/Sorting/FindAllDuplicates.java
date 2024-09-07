package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(duplicates(a));
    }
    public static List<Integer> duplicates(int[] a) {
        List<Integer> duplicates = new ArrayList<Integer>();
        cyclicSort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]==i+1){
                duplicates.add(a[i]);
            }
        }
        return duplicates;
    }
    public static void cyclicSort(int[] a) {
        for(int i=0;i<a.length;){
            int c=a[i];
            if(a[c]!=a[i]){
                swap(a,i,c);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
