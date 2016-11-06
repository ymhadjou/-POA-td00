package td00.exo1;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Sphere extends Shape3D {
    double radius;
    public Sphere(double v) {
        super();
        this.radius = v;
    }

    @Override
    public Point3D getRefPoint() {
        return null;
    }

    @Override
    public double volume() {
        return 4*(3.14d)*Math.pow(radius,3);
    }

    @Override
    public double surface() {
        return 4*3.14*(radius*radius);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
