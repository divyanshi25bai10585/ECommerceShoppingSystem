// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class Order {

    private int orderId;
    private double amount;
    private String status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = "PLACED";
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Status: " + status);
    }

    public int getOrderId() {
        return orderId;
    }
}
