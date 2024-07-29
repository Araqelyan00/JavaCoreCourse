package homework.lesson8.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Aram");
        queue.add("James");
        queue.add("Bob");
        queue.add("Sam");
        queue.add("Sara");
//        Method add(), and method offer() are same, but if we have limited queue, for 4 elements,
//        adding Sara will throw exception, but if we added elements with method offer() adding Sara wouldn't throw exception,
//        but Sara wouldn't be added to queue.

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
//        System.out.println(queue.element());  // This line throw NoSuchElementException
        System.out.println(queue.peek());   // this line does the same thing but not throws exception, it returns null.
        System.out.println(queue);
//        If we try to get element from empty queue by using element() method it will throw exception,
//        we can use method peek() it is a same method but in same case don't throw exception
//        Method remove() and method poll() are same, but if we try to remove element from empty queue method will throw exception,
//        in the same case method poll will return null.
//        System.out.println(queue);
    }
}
