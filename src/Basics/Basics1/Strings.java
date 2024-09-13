package Basics.Basics1;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "Ashish Srivastava";
        System.out.println(name + " " + name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(0 , 6));

//        Taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println(num);

        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println(firstName);

        sc.close();
    }
}
