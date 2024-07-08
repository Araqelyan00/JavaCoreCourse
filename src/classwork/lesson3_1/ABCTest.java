package classwork.lesson3_1;

public class ABCTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        c.printHello();
        System.out.println(ShowHello.getDefaultCount());

        printHello5Times(a);
        printHello5Times(b);

        ShowHello hello = new A();
    }

    static void printHello5Times(ShowHello h) {
        for (int i = 0; i < 5; i++) {
            h.printHello();
        }
    }

}
