public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public void display() {
        System.out.println(this.name+ " - " + this.engine);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "2022");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Toyota", "2025");
        System.out.println(Car.numberOfCars);
        car1.display();
        car2.display();
    }
}

