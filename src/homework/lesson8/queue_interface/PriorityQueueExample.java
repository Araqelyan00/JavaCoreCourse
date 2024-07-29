package homework.lesson8.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(8);
        pq.add(6);
        pq.add(3);
        pq.add(9);
        pq.add(1);

        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}
