package classwork.lesson1;

public class Box {
    double w;
    double h;
    double l;

    Box(double w1, double h1, double l1) {
        this.w = w1;
        this.h = h1;
        this.l = l1;
    }

    double volume() {
        return h * w * l;
    }

    boolean equal(Box box3){
        return (this.w == box3.w
                && this.h == box3.h
                && this.l == box3.l);
    }

}