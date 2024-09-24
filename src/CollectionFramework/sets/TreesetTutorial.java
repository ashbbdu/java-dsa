package CollectionFramework.sets;

import java.util.HashSet;

public class TreesetTutorial {
    public static void main(String[] args) {
//        we can store unique data in a sorted order in tree set
        HashSet <Integer> arr = new HashSet<Integer>();

        for(int i = 0 ; i < 5 ; i++) {
            arr.add(5 - i);
        }

        System.out.println(arr);
    }
}
