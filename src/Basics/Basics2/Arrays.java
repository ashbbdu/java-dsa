package Basics.Basics2;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0 ; i < 5 ; i++) {
            arr[i] = i + 1;
        }


        for(int i = 0 ; i < 5 ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        System.out.println(intArray.length + " length");
    }
}
