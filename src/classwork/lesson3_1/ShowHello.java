package classwork.lesson3_1;

public interface ShowHello {
    static int getDefaultCount(){
        return 1;
    }
    default void printHello(){
        System.out.println("Hello");
    }
}
