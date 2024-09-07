package Sorting;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {
    public static void main(String[] args) {
        int[] a= {1,1};
        cyclicSort(a);
        System.out.println(findDisappearedNumbers(a));
    }

    public static void swap(int[] a,int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void cyclicSort(int[] a){
        for(int i=0;i<a.length;i++){
            int c=a[i]-1;
            if(a[i]<=a.length && a[i]!=a[c]){
                swap(a,i,c);
                c=a[i]-1;
            }
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls= new ArrayList<>();
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                ls.add(i+1);
        }
        return ls;
    }
}
