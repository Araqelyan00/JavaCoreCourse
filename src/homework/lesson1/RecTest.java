package homework.lesson1;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[10];
    }

    void print(int i) {
        if (i == 0) return;
        else print(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
