package homework.lesson8.list_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        System.out.println(list1);
        List<String> list2 = new LinkedList<>();

        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

        list1.remove("E");
        System.out.println(list1);

        list1.addAll(list2);
        System.out.println(list1);

        list1.retainAll(list2);
        System.out.println(list1);

        list1.addAll(list2);
        list1.removeAll(list2);
        System.out.println(list1);

        list1.addLast("E");
        System.out.println(list1);

        list2.removeFirst();
        System.out.println(list2);

        list2.addFirst("9");
        System.out.println(list2);
    }
}
