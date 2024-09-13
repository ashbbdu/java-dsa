package Basics.Basics2;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age !");
        int age = sc.nextInt();
//        if(age >= 18 && age <= 60) {
//            System.out.println("Adult");
//        } else if (age > 60) {
//            System.out.println("Older");
//        } else {
//            System.out.println("Teen");
//        }

        switch (age) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 67 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        sc.close();
    }
}
