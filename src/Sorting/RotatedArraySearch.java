package Sorting;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        System.out.println(search(nums,target));
    }
        public static int search(int[] nums, int target) {
        int peak = peakSearch(nums);
            if(nums.length==1){
                return nums[0]==target?0:-1;
            }
            if(peak==-1){return binarySearch(0,nums.length-1,target,nums);}
            if(nums[peak]==target) return peak;

            if(nums[0]<=target)
                return binarySearch(0, peak-1, target, nums);
            else
                return binarySearch(peak+1, nums.length - 1, target, nums);
        }

        public static int peakSearch(int[] nums) {
            int start = 0, end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid>start && nums[mid] < nums[mid - 1])
                    return mid-1;
                if(mid <end && nums[mid] > nums[mid + 1] ) {
                    return mid;
                } if(nums[mid] <= nums[start]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
            return -1;
        }

        public static int binarySearch(int start, int end, int num, int[] arr) {
            while (start <= end) {
                int mid = (start + (end - start) / 2);
                if (arr[mid] < num) {
                        start = mid + 1;
                } else if (arr[mid] > num) {
                        end = mid - 1;
                    }
                else {
                    return mid;
                }
            }
            return -1;
        }
    }
