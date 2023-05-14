package Point2D_Point3D;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D.setXYZ(2.3f, 4.5f, 6.7f);
        System.out.println(point3D.getXYZ()[0]);
        System.out.println(point3D.getXYZ()[2]);
        System.out.println(point3D.getXYZ()[3]);
        System.out.println(point3D);
    }
}
