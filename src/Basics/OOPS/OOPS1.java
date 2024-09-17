package Basics.OOPS;

    class Test {
        String myName;
        public    void printName(String name) {
        myName = name;
        }
    }

    class  Sum {
        int sum;
        public void printSum(int a , int b) {
            sum = a+b;
//            I don't know if return works of not
        }
    }

public class OOPS1 {
    public static void main(String[] args) {

//        Test.printName();
//        Test test = new Test();
//        test.printName();

        Test name1 = new Test();
        name1.printName("Ashish");

        Test name2 = new Test();
        name2.printName("Maddy");

        System.out.println(name1.myName);
        System.out.println(name2.myName);

        Sum s1 = new Sum();
        s1.printSum(1,2);
        System.out.println(s1.sum);
    }
}
