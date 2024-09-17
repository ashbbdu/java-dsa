package Basics;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
//            Always execute if there is any exception or not
            System.out.println("finally");
        }

    }
}
