package classwork.lesson1;

public class OverloadTestDemo {
    public static void main(String[] args) {
        OverloadTest obj1 = new OverloadTest();
        obj1.test();
        obj1.test(124);
        obj1.test("Barev!");
    }
}
