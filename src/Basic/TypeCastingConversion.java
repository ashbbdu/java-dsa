package Basic;

import java.util.Scanner;

public class TypeCastingConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);


//      Following casting here
//        int n = input.nextInt();
//        System.out.println(n);


//      typecasting  Output is 65 , we are giving bigger number into smaller explicitly 
        int number = (int)65.77;
        System.out.println(number);
    }
}
