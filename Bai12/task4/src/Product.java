public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private static int nextId = 1;

    public Product( String name, double price, int quantity) {
        this.id = nextId++;
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

    @Override
    public String toString() {
        return "Product{" +
                "\tid= " + id + "\t" +
                ",name= " + name + '\'' +
                ", \tprice= " + price +
                ", \tquantity= " + quantity +
                '}';
    }
}
