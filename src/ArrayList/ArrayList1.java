package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> rollNumbers = new ArrayList<Integer>();

        for(int i = 1 ; i <=5 ; i++) {
            rollNumbers.add((i));
        }
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(rollNumbers.get(i));
        }

        for(Integer i : rollNumbers) {
            System.out.println(i);
        }



    }
}
