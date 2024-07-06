package classwork.lesson2;

public class ColorBox extends Box {
    int color;
    public ColorBox(int color, double width, double height, double depth) {
        super(width, height, depth);
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new ColorBox(color, width, height, depth);
    }
}
