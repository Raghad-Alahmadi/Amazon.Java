public class Clothing extends Product {
    private String size;

    // Constructor
    public Clothing(int productID, String name, String category, double price, int stockQuantity, String size) {
        super(productID, name, category, price, stockQuantity);
        this.size = size;
    }

    // Override calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount for clothing
    }
}