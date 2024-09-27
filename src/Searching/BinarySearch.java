package Searching;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int mid = (s + e) / 2;
        while(s < e) {
            if(target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            }
            mid = (s + e) / 2;
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        System.out.println(search(arr , 3));
    }
}
