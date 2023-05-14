public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius is " + circle.getRadius());
        System.out.println("Area is "+ circle.getArea());
        Circle circle1 = new Circle(2.0);
        System.out.println("Radius is " + circle1.getRadius());
        System.out.println("Area is " + circle1.getArea());
    }
}
