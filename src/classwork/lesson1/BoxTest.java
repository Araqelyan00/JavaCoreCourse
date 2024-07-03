package classwork.lesson1;

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(2.4,2.7,3.5);
        Box box2 = new Box(4.3,1.6,3.5);
        System.out.println("Volum box1 :" + box1.volume());
        System.out.println("Volum box2 :" + box2.volume());
        System.out.println(box2.equal(box2));
    }
}