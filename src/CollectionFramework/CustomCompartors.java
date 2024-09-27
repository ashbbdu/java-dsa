package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CustomCompartors {
    public static void main(String[] args) {
        ArrayList  <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);

        arr.add(4);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
