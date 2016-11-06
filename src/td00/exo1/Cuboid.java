package td00.exo1;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Cuboid extends Shape3D {
    double length;
    double width;
    double height;
    public Cuboid(double v, double v1, double v2) {
        super();
        this.height = v;
        this.length = v1;
        this.width = v2;
    }

    @Override
    public double surface() {
        return 2*length*height + 2*height*width + 2*length*width;
    }

    @Override
    public double volume() {
        return height*length*width;
    }

    @Override
    public Point3D getRefPoint() {
        return getRefPoint();
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "length=" + length +
                ", width=" + width +
                ", heigt=" + height +
                '}';
    }
}
