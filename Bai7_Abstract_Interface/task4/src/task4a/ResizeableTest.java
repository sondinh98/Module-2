package task4a;

import lophinhhoc.Circle;
import lophinhhoc.Rectangle;


public interface ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.0, 4.0);


        System.out.println("Before resizing:");
        System.out.println(circle);
        System.out.println(rectangle);


        circle.resize(50);
        rectangle.resize(200);


        System.out.println("After resizing:");
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
