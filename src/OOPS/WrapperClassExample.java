package OOPS;

public class WrapperClassExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer ash = 20; // this comes with it's own set of values
        swap(a , b);

        Integer c =10;
        Integer d = 20;
        swapp(c , d);
        System.out.println(c + " " + d);
    }
    public static void swap (int a , int b)  {
//        this program will be not swap the integers becuase int is a primitive data type and primitive data type pass values not reference
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapp (Integer a , Integer b)  {
        int temp = a;
        a = b;
        b = temp;
    }

}

