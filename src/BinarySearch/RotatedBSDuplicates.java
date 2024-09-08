package BinarySearch;

public class RotatedBSDuplicates {
    public static void main(String[] args) {
        int nums[] = {6,7,1,2,4};
        int target = 4;
        int pivot = pivot(nums,0,nums.length-1);
        if(pivot == -1){
            System.out.println(binarySearch(nums,target,0,nums.length-1));
        }
        if(nums[pivot] == target)
            System.out.println(pivot);
        else if(target >= nums[0])
            System.out.println(binarySearch(nums,target,0,pivot-1));
        else
            System.out.println(binarySearch(nums,target,pivot+1,nums.length-1));
    }
    public static int binarySearch(int[] nums,int target,int start,int end) {
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if(target>nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static int pivot(int[] nums,int start,int end){
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                {
                    if(start<end && nums[start]>nums[start+1]){
                        return start;
                    }
                    if(end>start && nums[end]<nums[end-1]){
                        return end-1;
                    }
                    start++;
                    end--;
                }
            }else if(nums[mid]>nums[start] || nums[mid]==nums[start] && nums[mid]<nums[end]) {
                start = mid + 1;
            }else
                end = mid -1;
        }
        return -1;
    }
}
