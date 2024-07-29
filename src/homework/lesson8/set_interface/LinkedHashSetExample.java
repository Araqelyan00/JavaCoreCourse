package homework.lesson8.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(4);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(0);
        System.out.println(set);

        set.remove(5);
        System.out.println(set);
        System.out.println(set.contains(5));
        System.out.println(set.contains(0));
    }
}
