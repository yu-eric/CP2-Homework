package Chapter3;

public class ProductPrinter {
    public static void main(String []args) {
        Product salmon = new Product("Salmon", 10.99);
        System.out.println(salmon.getName() + " costs $" + salmon.getPrice() + ". ");

        salmon.reducePrice(5.00);
        System.out.println("After a $5.00 discount, it only costs $" + salmon.getPrice() + ".");

        Product steak = new Product("Steak", 8.99);
        System.out.println(steak.getName() + " costs $" + steak.getPrice() + ". ");

        steak.reducePrice(5.00);
        System.out.println("After a discount, it only costs $" + steak.getPrice() + ".");
    }


}
