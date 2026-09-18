// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class SystemTest {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       E-COMMERCE SYSTEM TEST");
        System.out.println("========================================");

        ProductManager productManager = new ProductManager();

        // Test 1: Product Search
        System.out.println("\nTest 1: Product Search");

        Product product = productManager.getProductById(101);

        if (product != null) {
            System.out.println("PASS - Product found.");
        } else {
            System.out.println("FAIL - Product not found.");
        }


        // Test 2: Shopping Cart
        System.out.println("\nTest 2: Shopping Cart");

        Cart cart = new Cart();

        cart.addItem(product, 1);

        if (!cart.isEmpty()) {
            System.out.println("PASS - Product added to cart.");
        } else {
            System.out.println("FAIL - Cart is empty.");
        }


        // Test 3: Order Creation
        System.out.println("\nTest 3: Order Creation");

        OrderManager orderManager = new OrderManager();

        Order order = orderManager.placeOrder(cart);

        if (order != null) {
            System.out.println("PASS - Order created.");
        } else {
            System.out.println("FAIL - Order not created.");
        }


        // Test 4: Billing
        System.out.println("\nTest 4: Billing");

        Billing billing = new Billing();

        billing.generateBill(55000);


        // Test 5: Payment
        System.out.println("\nTest 5: UPI Payment");

        PaymentMethod payment = new UPIPayment();

        payment.pay(55000);

        System.out.println("\n========================================");
        System.out.println("       ALL TESTS COMPLETED");
        System.out.println("========================================");
    }
}