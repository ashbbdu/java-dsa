package CollectionFramework.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }
    }
}
