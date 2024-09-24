package CollectionFramework.sets;

import java.util.HashSet;

public class HashSetTutorial {
    public static void main(String[] args) {
//        it stores unique elements in random order
        HashSet <Integer> arr = new HashSet<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(2);

        System.out.println(arr);

        for(Integer i : arr) {
            System.out.println(i);
        }
    }
}
