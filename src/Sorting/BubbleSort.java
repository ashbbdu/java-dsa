package Sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = new int[]{5,7,6,7,8,-1 , 2, 5, 1,2};
        System.out.println(arr.length);
        for(int i = 0 ; i < bubbleSort(arr).length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
