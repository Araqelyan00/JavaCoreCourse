package homework.lesson8.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "four");
        treeMap.put(2, "two");
        treeMap.put(5, "five");
        treeMap.put(3, "three");
        treeMap.put(1, "one");

        System.out.println(treeMap);

//        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(2));
        System.out.println(treeMap.lastEntry());
    }
}
