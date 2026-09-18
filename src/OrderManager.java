// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

import java.util.ArrayList;

public class OrderManager {

    private ArrayList<Order> orders;
    private int nextOrderId = 1001;
    private FileManager fileManager;

    public OrderManager() {

        orders = new ArrayList<>();
        fileManager = new FileManager();
    }

    public Order placeOrder(Cart cart) {

        if (cart.isEmpty()) {

            System.out.println("Cart is empty.");
            return null;
        }

        Order order = new Order(
            nextOrderId,
            cart.getTotalAmount()
        );

        orders.add(order);

        fileManager.saveOrder(
            order.getOrderId(),
            cart.getTotalAmount()
        );

        nextOrderId++;

        cart.clearCart();

        System.out.println("\nOrder placed successfully!");
        System.out.println(
            "Your Order ID: " + order.getOrderId()
        );

        return order;
    }

    public void displayOrders() {

        if (orders.isEmpty()) {

            System.out.println("No orders found.");
            return;
        }

        System.out.println("\n========== YOUR ORDERS ==========");

        for (Order order : orders) {

            order.displayOrder();

            System.out.println("-------------------------------");
        }
    }

    public void trackOrder(int orderId) {

        for (Order order : orders) {

            if (order.getOrderId() == orderId) {

                order.displayOrder();
                return;
            }
        }

        System.out.println("Order not found.");
    }
}