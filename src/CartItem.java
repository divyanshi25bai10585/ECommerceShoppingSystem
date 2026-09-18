// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getProductId() {
        return product.getProductId();
    }

    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getTotal() {
        return product.getPrice() * quantity;
    }

    public void displayItem() {
        System.out.println(
            product.getName() +
            " | Quantity: " + quantity +
            " | Total: ₹" + getTotal()
        );
    }
}