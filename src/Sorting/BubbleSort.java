package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before: "+Arrays.toString(array));
        System.out.println("After: "+Arrays.toString(sortBubble(array)));
    }
    public static int[] sortBubble(int[] array) {
        for(int i=0;i<array.length;i++){
            boolean swap = false;
            for(int j=1;j<array.length-i;j++){
                if(array[j]<array[j-1])
                {
                    int t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                    swap=true;
                }
            }
            if(!swap){
                System.out.println(swap);
                return array;
            }
        }
        return array;
    }
}
