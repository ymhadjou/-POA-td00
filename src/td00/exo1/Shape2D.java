package td00.exo1;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public abstract class Shape2D extends Shape implements Translatable2D {

    private final Point2D refPoint;

    protected Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    public Point2D getRefPoint() {
        return refPoint;
    }



    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape2D{" +
                "refPoint=" + refPoint +
                '}';
    }
}
