package Circle_Cylinder;

public class Cylinder extends Circle{
    private double height = 5;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTheTich() {
        return Math.PI * height * getRadius() * getRadius();
    }
    @Override
    public String toString() {
        return " A Cylinder with height = "
                + getHeight()
                + " The tich hinh tru la : "
                + getTheTich()
                + super.toString();
    }
}
