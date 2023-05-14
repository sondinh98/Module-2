package Point_MoveablePoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point.setXY(2.3f, 4.5f);
        System.out.println(point.getXY()[0]);
        System.out.println(point.getXY()[1]);
        System.out.println(point);
    }
}
