package Sorting;

public class SelectionSort {
    public  static  int[] selectionSort () {
        int[] nums = new int[] {5,4,6,3,2,-1,1};
        for (int i = 0 ; i < nums.length - 1 ; i++) {
            int minIndex = i;
            for(int j = i  ; j < nums.length   ; j++) {
                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }
    public static void main(String[] args) {

        for(int i = 0 ; i < selectionSort().length  ; i++) {
            System.out.println(selectionSort()[i]);
        }
    }
}
