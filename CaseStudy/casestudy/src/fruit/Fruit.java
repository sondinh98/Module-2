package fruit;

public class Fruit {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private static int nextID = 0;

    public Fruit(String name, double price, int quantity, String description) {
        this.id = ++nextID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNextID() {
        return nextID;
    }

    public void setNextID(int nextID) {
        this.nextID = nextID;
    }

    @Override
    public String toString() {
        return String.format("%3d%25s%25.0f%25d%35s",id,name,price,quantity,description);
    }
}
