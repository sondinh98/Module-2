package task4b;

public interface ColorableTest {
    public static void main(String[] args) {
        Square square1 = new Square(5.0);
        Square square2 = new Square(7.0);

        System.out.println("Before coloring:");
        System.out.println(square1);
        System.out.println(square2);

        square1.howToColor();
        square2.howToColor();

        System.out.println("After coloring:");
        System.out.println(square1);
        System.out.println(square2);
    }
}
