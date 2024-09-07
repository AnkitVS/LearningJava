package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(a));
    }

    public static int missingNumber(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

    public static void cyclicSort(int[] a) {
        for (int i = 0; i < a.length ;) {
            int c = a[i];
            if (c < a.length && a[i] != a[c]) {
                swap(a, i, c);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

