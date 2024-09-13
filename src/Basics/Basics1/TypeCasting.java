package Basics.Basics1;

public class TypeCasting {
    public static void main(String[] args) {
//        Type Casting
//        Implicit type conversion
        int x = 10;
        double y = x;
        System.out.println(y);



//    Explicit
        double a = 10.77;
//        int b = a; // will through an error because we will loose .77 here so here we have to explicitly do type conversion
        int b = (int)a;
        System.out.println(y);


//        Final keyword
        final int c = 10;
//        c = 20;
        System.out.println(c);
    }
}
