// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

import java.util.ArrayList;

public class Cart {

    private ArrayList<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {

        for (CartItem item : items) {

            if (item.getProductId() == product.getProductId()) {
                item.increaseQuantity(quantity);
                System.out.println("Product quantity updated in cart!");
                return;
            }
        }

        items.add(new CartItem(product, quantity));
        System.out.println("Product added to cart!");
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getTotalAmount() {

        double total = 0;

        for (CartItem item : items) {
            total += item.getTotal();
        }

        return total;
    }

    public void clearCart() {
        items.clear();
    }

    public void displayCart() {

        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n========== YOUR CART ==========");

        for (CartItem item : items) {
            item.displayItem();
        }

        System.out.println("-------------------------------");
        System.out.println("Total Amount: ₹" + getTotalAmount());
    }
}