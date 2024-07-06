package classwork.lesson2;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(double weight, double width, double height, double depth) {
        super(width, height, depth);
        double volume = volume() * weight;
        this.weight = weight;
        System.out.println("Box weight is :" + volume);
    }
}
