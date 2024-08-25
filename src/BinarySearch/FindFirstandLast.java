package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstandLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int num = input.nextInt();
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6};
        System.out.println(Arrays.toString(search(arr, num)));
        System.out.println(combinedSearch(arr, num,true)+","+combinedSearch(arr, num,false));
    }

    public static int[] search(int[] arr, int num) {
        int start = 0, end = arr.length - 1;
        int[] pos = {-1, -1};
        /*Searching the first position*/
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] == num) {
                end = mid - 1;
            }
        }
        pos[0] = start;
        /*Searching the last position*/
        end = arr.length - 1;
        start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] == num) {
                start = mid + 1;
            }
        }
        pos[1] = end;
        return pos;
    }

    public static int combinedSearch(int[] arr, int num,boolean firstIndex) {
        int start = 0, end = arr.length - 1,ans = -1;
        /*Combined*/
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] == num) {
                ans=mid;
                if(firstIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
