package Basics.Basics2;

public class TwoDimArray {
    public static void main(String[] args) {
        int [][] brr = {{1,2,3,4} , {5,6,7,8} , {9,1,2,3} , {4,5,6,7}};
        int [][] arr = new int[4][4];
        for(int i = 0 ; i < 4 ; i++) {
            for(int j = 0 ; j < 4 ; j++) {
                arr[i][j] = brr[i][j];
            }
        }

        for(int i = 0 ; i < 4 ; i++) {
            for(int j = 0 ; j < 4 ; j++) {
                System.out.print( arr[i][j] +  " ");
            }
            System.out.println();
        }
    }
}
