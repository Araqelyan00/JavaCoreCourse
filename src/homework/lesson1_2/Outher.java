package homework.lesson1_2;

public class Outher {
    int out = 100;

    void test() {
        for (int i = 0; i < 2; i++) {
            class Inner {
                void print() {
                    System.out.println("Out is : " + out);
                }
            }
            Inner inner = new Inner();
            inner.print();
        }
    }
}
