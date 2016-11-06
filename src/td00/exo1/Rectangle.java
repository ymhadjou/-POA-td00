package td00.exo1;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Rectangle extends Shape2D {

    private final double length;
    private final double width;

    public Rectangle(Point2D refPoint,double i, double j) {
        super(refPoint);
        this.length = i;
        this.width =j;
    }

    @Override
    public double perimeter() {
        return  2 *(length + width);
    }

    public Point2D getRefPoint(){
        return this.getRefPoint();
    }

    @Override
    public double surface() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{\n" +
                super.toString() +
                "\nlength=" + length +
                ", width=" + width +
                "\n}";
    }
}
