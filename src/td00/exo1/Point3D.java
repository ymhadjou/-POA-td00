package td00.exo1;

import java.awt.*;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Point3D extends Point2D {

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void translate(double ax, double ay, double z) {
        setZ(z);
        setX(ax);
        setY(ay);
    }

    @Override
    public boolean isOrigin() {
        if(this.getY() == 0 && this.getZ() == 0 && this.getX() ==0 ){
            return true;
        }
        return false;
    }


    public double distance(Point3D dist) {
       return 0.0d;
    }
}
