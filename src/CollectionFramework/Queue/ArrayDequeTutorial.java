package CollectionFramework.Queue;

import java.util.ArrayDeque;

public class ArrayDequeTutorial {
//    First in first out
    public static void main(String[] args) {
        ArrayDeque <Integer> ad = new ArrayDeque<Integer>();
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);

        ad.poll(); // poll removes the element
        System.out.println(ad.peek());
    }
}
