package CollectionFramework.Queue;

import java.util.PriorityQueue;

public class PriorityQueueTutorial {
    public static void main(String[] args) {
//        stores element and when you ask for peek returns you the smallest number , it stores in tree structures
//        it gives next smallest number ,
        PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
        pq.offer(0);
        pq.offer(1);
        pq.offer(5);
        pq.offer(4);
//        System.out.println(pq.peek());
//        pq.poll();
//        System.out.println(pq.peek());
//        pq.poll();
//        System.out.println(pq.peek());
//        we can not directly iterate through pq so
        while (pq.isEmpty() == false) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
