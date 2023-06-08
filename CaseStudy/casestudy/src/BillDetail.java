public class BillDetail {
    private int fruitID;
    private String fruitName;
    private int fruitQuantity;
    private double fruitPrice;

    public BillDetail(int fruitID, String fruitName, int fruitQuantity, double fruitPrice) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.fruitQuantity = fruitQuantity;
        this.fruitPrice = fruitPrice;
    }

    public int getFruitID() {
        return fruitID;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitQuantity() {
        return fruitQuantity;
    }

    public void setFruitQuantity(int fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }
}
