package thietke_va_trienkhai_lop_Triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3: ");
        double side3 = scanner.nextDouble();
        System.out.println("Enter color: ");
        String color = scanner.next();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println(triangle);
        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
    }
}
