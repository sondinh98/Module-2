public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private static int nextID = 1;

    public Product(String name, double price, int quantity) {
        this.id = nextID++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
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

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Product.nextID = nextID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "\tid=" + id + "," +
                "\t name='" + name + '\'' + "," +
                "\t price=" + price + "," +
                "\t quantity=" + quantity +
                '}';
    }
}
