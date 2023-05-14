package Point2D_Point3D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D.setXY(2.4f, 4.5f);
        System.out.println(point2D.getXY()[0]);
        System.out.println(point2D.getXY()[1]);
        System.out.println(point2D);
    }
}
