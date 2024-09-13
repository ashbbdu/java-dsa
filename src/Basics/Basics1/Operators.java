package Basics.Basics1;

public class Operators {

public static void main(String[] args) {
    //    Arithmetic Operator => + , - , / , % *
    int num1 = 2;
    int num2 = 5;
    int num3 = num1 + num2;
    int num4 = num2 / num1;
    System.out.println(num3);
    System.out.println(num4);

//    Unary Operators => + , - , ++ , -- , !

//    int num = 6;
//    int numm = num++;  //means once this operation is done then increment
//    System.out.println("num 1 " + num );  //7
//    System.out.println("num 2 " + numm ); //6

//    int num = 6;
//    int numm = ++num;  //means first increament done to the operation
//    System.out.println("num 1 " + num );  //7
//    System.out.println("num 2 " + numm ); //7

//    int num = 6;
//    int numm = num--;
//    System.out.println("num 1 " + num );  //5
//    System.out.println("num 2 " + numm ); //6

    int num = 6;
    int numm = --num;  //means once this operation is done then increment
    System.out.println("num 1 " + num );  //5
    System.out.println("num 2 " + numm ); //5


//    Relational Operators // return boolean

    int a = 10;
    int b = 12;
    boolean c = a == b;
    System.out.println(c);


//    Logical Operator && , ||
//    Conditional Operator

    int d =  a > b ? a : b;
    System.out.println(d);

}
}
