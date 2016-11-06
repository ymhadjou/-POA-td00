package td00.exo1;



/**
 * Created by yamhadjo on 20/09/2016.
 */
public abstract class Shape3D extends Shape implements Translatable3D {
    Point3D refPoint;

    public abstract double volume();
    public abstract Point3D getRefPoint();

    @Override
    public String toString() {
        return "Shape3D{" +
                "refPoint=" + refPoint +
                '}';
    }
}
