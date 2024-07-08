package classwork.lesson2;

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(12.4, 4, 1, 2);
        ColorBox colorBox = new ColorBox(1, 2.3, 4, 6);

        colorBox.equals(null);
        printVolumeDouble(boxWeight);
        printVolumeDouble(colorBox);

    }

    static void printVolumeDouble(Box box) {
        System.out.println(box.volume());
        if (box instanceof ColorBox) {
            ColorBox colorBox = (ColorBox) box;
            System.out.print("Color :");
            System.out.println(colorBox.color);
            BoxWeight boxWeight = new BoxWeight(12.4, 4, 1, 2);
        }
    }
}
