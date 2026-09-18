// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("Payment Method: Card");
        System.out.println("Amount Paid: Rs." + amount);
        System.out.println("Card Payment Successful!");
    }
}