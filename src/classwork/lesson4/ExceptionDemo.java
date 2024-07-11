package classwork.lesson4;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            printWithoutWhiteSpace(null);
        } catch (NoWhiteSpaceException | NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After Method call");
    }

    static String printWithoutWhiteSpace(String value) throws NoWhiteSpaceException {
        if (value == null) {
            throw new NullPointerException("value is null");
        }

        if (value.equals("")) {
            throw new IllegalArgumentException("value is empty");
        }
        if (!value.contains(" ")) {
            throw new NoWhiteSpaceException();
        }
        return value.trim();
    }
}
