package td00.exo1;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Cone extends Shape3D {
    double height;
    double radius;
    public Cone(double v, double v1) {
        super();
        this.height=v;
        this.radius = v1;
    }

    @Override
    public double volume() {
        return 3.14d * (radius * radius) * (height/3);
    }

    @Override
    public double surface() {
        return 3.14d * radius * Math.sqrt((radius*radius)+(height*height));
    }

    @Override
    public Point3D getRefPoint() {
        return this.getRefPoint();
    }

    @Override
    public String toString() {
        return "Cone{" +
                super.toString() +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
