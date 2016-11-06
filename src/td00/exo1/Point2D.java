package td00.exo1;


/**
 * Modélise les point en 2 dimension
 * Created by yamhadjo on 20/09/2016.
 */
public class Point2D {

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    private double x;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double y;

    public Point2D(double x2d, double y2d) {
        this.x = x;
        this.y = y;
    }

    public void translate(double ax,double ay)
    {
    setX(ax);setY(ay);
    }

    public boolean isOrigin(){
        if(this.getX()==0 && this.getY()==0)
        {
            return true;
        }
        return false;
    }

    public double distance(Point2D dist){

        return 0.0d;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
