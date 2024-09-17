package Basics.OOPS;

//class ASH {
//    public void greeting () {
//        System.out.println("Print SUm is called");
////        return  10;
//    }
//}

class PRODUCT {
    public int product(int a , int b) {
        return  a + b;
    }
}

public class OOPS2 {
//    Methods and Functions
//    This method is only available in OOPS2 class
    private static int num (int a) {
        return  a;
    }

    public static void main(String[] args) {


    try {
        //        System.out.println(greeting());
//        ASH ash = new ASH();
//        ash.greeting();

        System.out.println(num(10));
        PRODUCT s = new PRODUCT();
        System.out.println(s.product(1,4));
    } catch (Exception e) {
        System.out.println(e);
    }
    }
}
