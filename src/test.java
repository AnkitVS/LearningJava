import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {39,100,81,98,59,39,20,25};
        int k = 39;
        System.out.println(minOperations(arr, k));
    }

    public static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        if (nums[0] >= k)
            return 0;
        if (nums[nums.length - 1] < k)
            return nums.length;

        int start = 0, end = nums.length - 1;
        int pos=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (k <= nums[mid])
                {end = mid - 1;}
            else if (k > nums[mid]) {
                    start = mid + 1;
                    pos = mid;
                }
        }
        return (pos);
    }
}

