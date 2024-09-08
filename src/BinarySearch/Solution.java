package BinarySearch;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int target = 0;
        System.out.println(search(nums,target));
    }

    public static boolean search(int[] nums, int target) {
        if (nums.length == 1 && target == nums[0])
            return true;
        else if (nums.length == 0 || target != nums[0] && nums.length == 1)
            return false;
        else {
            int pivot = pivot(nums, 0, nums.length - 1);
            if (pivot == -1)
                return binarySearch(nums, target, 0, nums.length - 1);
            if (nums[pivot] == target)
                return true;
            if (nums[0] > target)
                return (binarySearch(nums, target, pivot + 1, nums.length - 1));
            else
                return (binarySearch(nums, target, 0, pivot - 1));
        }
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                return true;
        }
        return false;
    }

    public static int pivot(int[] nums, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1])
                    return start;
                else if (end > start && nums[end] < nums[end - 1])
                    return end - 1;
                start++;
                end--;
            } else if (nums[mid] > nums[end])
                start = mid;
            else
                end = mid - 1;
        }
        return -1;
    }
}

