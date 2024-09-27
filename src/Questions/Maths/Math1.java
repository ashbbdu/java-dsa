package Questions.Maths;

import java.util.Vector;

public class Math1 {

    public static boolean reverseString(Vector<Character> s) {
        //your code goes here
        int start = 0;
        int end = s.size() - 1;
        while(start < end) {
            Character temp = s.get(start);
            end = s.get(start);
            start = s.get(end);
            start++;
            end--;
        }
        System.out.println(s);
        return  true;
    }

    public static boolean isPrime(int n) {
        //your code goes here
        int count = 0;
        for (int i = 1 ; i <= n/2 ; i++) {
            if(n % i == 0) {
                count = count + 1;
            }
        }
        if(count > 2) {
            return false;
        } else {
            return true;
        }
    }
    public static int primeUptoN(int n) {
        int count = 0;
        for(int i = 2 ; i <= n /2; i++) {
            if(isPrime(i)) {
                count = count + 1;
            }

        }
        return count;
    }

    public static int countDigit(int n) {
        int count = 0;
        if(n == 0 ) {
            return 1;
        }

        while(n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(0));
        System.out.println(1 % 2);
        int ash = 1 + (int)Math.pow(2,3);
        System.out.println(ash);
        System.out.println((int)Math.pow(2,3));
        System.out.println(primeUptoN(6));


        Vector<Character> v = new Vector<Character>();
        v.add('a');
        v.add('s');
        v.add('h');
        v.add('i');
        v.add('s');
        v.add('h');
//        System.out.println(reverseString(v));
    }


}

