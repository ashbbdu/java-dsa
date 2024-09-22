package FunctionsMethods;

import java.util.Scanner;

public class Functions {
    public  static int  printSum  () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Digit");
        int a = input.nextInt();
        System.out.println("Enter Second Digit");
        int b = input.nextInt();
        return a + b;
    }

     static void  swapNumbers (int a ,int b) {
        int temp = a ;
        a = b ;
        b = temp;

//        temp = 1,
//         a = 2
//         b = temp , which is 1
//         so swaped
        System.out.println(a + " " + b);
    }


    public static void main(String[] args) {
//        in java methods and functions are same.
//        Q1 : take input of two number and print sum


//        System.out.println(printSum());
//        System.out.println(printSum());
//        System.out.println(printSum());


            swapNumbers(1 , 2);
    }
}
