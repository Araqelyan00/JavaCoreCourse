package classwork.lesson2;

public class Box {
    public double width;
    public double height;
    public double depth;

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public double volume() {
        return width * height * depth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass())return false;
        Box box = (Box) obj;
        if (Double.compare(box.width, width) != 0)return false;
        if (Double.compare(box.height, height) != 0)return false;
        return Double.compare(box.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
    }
}
