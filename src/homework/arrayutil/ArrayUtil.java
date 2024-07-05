package homework.arrayutil;

public class ArrayUtil {
    int[] array = {2, 4, 3, 7, 88, 10, 90, 26, 43, 10};

    //    Number 1
    void printArraysAllElements() {
        System.out.print("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //    Number 2
    void findTheBiggestElement() {
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];
            }
        }
        System.out.println("The biggest element is: " + biggest);
    }

    //    Number 3
    void findTheSmallestElement() {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println("The smallest element is: " + smallest);
    }

    //    Number 4 / 6
    void printEvenElements() {
        int count = 0;
        System.out.print("Even elements are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Even elements count is: " + count);
    }

    //    Number 5 / 7
    void printOddElements() {
        int count = 0;
        System.out.print("Odd elements are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd elements count is: " + count);

    }

    //    Number 8
    void printArithmeticAverage() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average1 = sum / array.length;
        int average2 = sum % array.length;
        System.out.println("The average is: " + average1 + "." + average2);
    }

    //    Number 9
    void printSumOfElements() {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        arrayUtil.printArraysAllElements();
        arrayUtil.findTheBiggestElement();
        arrayUtil.findTheSmallestElement();
        arrayUtil.printEvenElements();
        arrayUtil.printOddElements();
        arrayUtil.printArithmeticAverage();
        arrayUtil.printSumOfElements();

    }

}
