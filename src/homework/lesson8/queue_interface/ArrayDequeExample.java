package homework.lesson8.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Methods addFirst & offerFirst are the same, but in the case of using limited Deque addFirst can throw exception
//        Methods addLast & offerLast are the same, but in the case of using limited Deque addLast can throw exception
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(1);
        deque.offerFirst(7);
        deque.offerLast(9);
        System.out.println(deque);
//        Methods removeFirst & pollFirst are the same, but in the case of using limited Deque removeFirst can throw exception
//        Methods removeLast & pollLast are the same, but in the case of using limited Deque removeLast can throw exception
        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);

        deque.addFirst(5);
        deque.addLast(1);
        deque.offerFirst(7);
        System.out.println(deque);

//        Methods getFirst & peekFirst are the same, but in the case of using limited Deque getFirst can throw exception
//        Methods getLast & peekLast are the same, but in the case of using limited Deque getLast can throw exception
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
