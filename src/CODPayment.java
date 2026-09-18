// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class CODPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("Payment Method: Cash on Delivery");
        System.out.println("Amount to Pay: Rs." + amount);
        System.out.println("Order placed with COD!");
    }
}