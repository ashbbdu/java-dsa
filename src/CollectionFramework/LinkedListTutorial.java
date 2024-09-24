package CollectionFramework;

import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args) {
//        we can add element from front and back both
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.addLast(9);
        myList.addFirst(10);

//        System.out.println(myList.getLast());
        System.out.println(myList.contains(10));

        for(int item : myList) {
            System.out.println(item);
        }
    }
}
