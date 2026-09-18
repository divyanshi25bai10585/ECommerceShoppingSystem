// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class UPIPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("Payment Method: UPI");
        System.out.println("Amount Paid: Rs." + amount);
        System.out.println("UPI Payment Successful!");
    }
}