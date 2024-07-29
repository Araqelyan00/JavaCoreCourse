package homework.lesson8.set_interface;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(2);
        ts.add(5);
        ts.add(3);
        ts.add(1);
//        ts.add(null);  Can't do that.

        System.out.println(ts);
        System.out.println(ts.contains(2));
        System.out.println(ts.first());
    }
}
