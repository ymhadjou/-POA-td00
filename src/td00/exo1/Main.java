package td00.exo1;



public class Main {

    public static void main(String[] args) {

        Point2D p1 = new Point2D(0.0d,0.0d);
        Shape shape = new Rectangle(p1,7.0d,3.0d);
      //  System.out.println(shape);
      //  System.out.println(shape.surface());
        Rectangle rect1 = new Square(p1,4,5);

       Shape3D sh3d = new Cone(7.0d,8.0d);
       Shape3D sphere = new Sphere(5.0d);
       Shape3D cuboid = new Cuboid(7.0d,5.0d,4.0d);
        System.out.println(sh3d);
        System.out.println(sphere);
        System.out.println(cuboid);







    }
}
