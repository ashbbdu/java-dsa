package Sorting;

public class SelectionSort {
    public  static  int[] selectionSort () {
        int[] nums = new int[] {5,4,6,3,2,-1,1};
        for (int i = 0 ; i < nums.length - 1 ; i++) {
            int minIndex = i;
            for(int j = i + 1  ; j < nums.length   ; j++) {
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

    public  static  int[] selectionSort1(int[] arr) {
        System.out.println("Inside selectionsort1");
      for(int i = 0 ; i < arr.length - 1 ; i++ ) {
          int minIndex = i;
          for(int j = i+1 ; j < arr.length ; j++) {
              if(arr[minIndex] > arr[j]) {
                  minIndex = j;
              }
          }
//          swapping
          int temp = arr[minIndex];
          arr[minIndex] = arr[i];
          arr[i] = temp;
      }
      return  arr;
    }
    public static void main(String[] args) {
        int arr [] = new int[]{5,7,6,7,8};
        for(int i = 0 ; i < selectionSort1(arr).length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
