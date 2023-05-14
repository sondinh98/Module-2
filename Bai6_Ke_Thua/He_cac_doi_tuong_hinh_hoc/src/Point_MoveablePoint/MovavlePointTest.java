package Point_MoveablePoint;

public class MovavlePointTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1.2f, 3.4f, 5.6f, 7.8f);
        System.out.println(point);
        point.move();
        System.out.println(point);
    }
}
