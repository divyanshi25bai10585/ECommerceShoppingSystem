// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class Product {

    private int productId;
    private String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void displayProduct() {
        System.out.println(
            productId + " | " +
            name + " | Rs." +
            price + " | Stock: " +
            stock
        );
    }
}