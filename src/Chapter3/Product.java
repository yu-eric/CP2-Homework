package Chapter3;

public class Product {
    private String name;
    private double price;

    public Product(String productName, double productPrice) {
        name = productName;
        price = productPrice;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void reducePrice(double priceReduction) {
        price -= priceReduction;
    }

}
