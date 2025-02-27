public class Electronics extends Product {
    private String warrantyPeriod;

    // Constructor
    public Electronics(int productID, String name, String category, double price, int stockQuantity, String warrantyPeriod) {
        super(productID, name, category, price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Override calculateDiscount method
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount for electronics
    }
}


