package BinarySearch;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,1};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return nums[pivot(nums, 0, nums.length - 1) + 1];
    }

    static int  pivot(int[] nums, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (nums[mid] == nums[end] && nums[mid] == nums[start]) {
                if (end > start && nums[end] < nums[mid - 1])
                    return end - 1;
                if (start < end && nums[start] > nums[start + 1])
                    return start;

                start++;
                end--;
            } else if (nums[mid] > nums[start] || nums[mid]==nums[start] && nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid-1;

        }
        return -1;
    }
}
