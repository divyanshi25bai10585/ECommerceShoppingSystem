// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductManager productManager = new ProductManager();
        Cart cart = new Cart();
        OrderManager orderManager = new OrderManager();
        Billing billing = new Billing();
        RecommendationEngine recommendationEngine =
                new RecommendationEngine();

        User user = null;
        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("     E-COMMERCE SHOPPING SYSTEM");
            System.out.println("========================================");

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Browse Products");
            System.out.println("4. Search Products");
            System.out.println("5. View Cart");
            System.out.println("6. Add to Cart");
            System.out.println("7. Place Order");
            System.out.println("8. View Orders");
            System.out.println("9. Track Order");
            System.out.println("10. Make Payment");
            System.out.println("11. Product Recommendations");
            System.out.println("12. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.print("Create username: ");
                    String username = sc.nextLine();

                    System.out.print("Create password: ");
                    String password = sc.nextLine();

                    user = new User(name, username, password);

                    System.out.println("Registration successful!");

                    break;


                case 2:

                    if (user == null) {

                        System.out.println("Please register first.");

                    } else {

                        System.out.print("Enter username: ");
                        String loginUsername = sc.nextLine();

                        System.out.print("Enter password: ");
                        String loginPassword = sc.nextLine();

                        if (user.getUsername().equals(loginUsername)
                                && user.checkPassword(loginPassword)) {

                            user.displayUser();

                        } else {

                            System.out.println(
                                "Invalid username or password."
                            );
                        }
                    }

                    break;


                case 3:

                    productManager.displayProducts();

                    break;


                case 4:

                    System.out.print("Enter product name to search: ");
                    String keyword = sc.nextLine();

                    productManager.searchProduct(keyword);

                    break;


                case 5:

                    cart.displayCart();

                    break;


                case 6:

                    System.out.print("Enter product ID: ");
                    int productId = sc.nextInt();

                    Product product =
                            productManager.getProductById(productId);

                    if (product == null) {

                        System.out.println("Product not found.");

                    } else {

                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        if (quantity > 0 &&
                                quantity <= product.getStock()) {

                            cart.addItem(product, quantity);

                        } else {

                            System.out.println(
                                "Invalid quantity or insufficient stock."
                            );
                        }
                    }

                    break;


                case 7:

                    orderManager.placeOrder(cart);

                    break;


                case 8:

                    orderManager.displayOrders();

                    break;


                case 9:

                    System.out.print("Enter Order ID: ");
                    int orderId = sc.nextInt();

                    orderManager.trackOrder(orderId);

                    break;


                case 10:

                    if (cart.isEmpty()) {

                        System.out.println("Cart is empty.");
                        break;
                    }

                    double amount = cart.getTotalAmount();

                    billing.generateBill(amount);

                    System.out.println("\n========== PAYMENT ==========");
                    System.out.println("1. UPI");
                    System.out.println("2. Card");
                    System.out.println("3. Cash on Delivery");

                    System.out.print("Choose payment method: ");
                    int paymentChoice = sc.nextInt();

                    PaymentMethod payment;

                    if (paymentChoice == 1) {

                        payment = new UPIPayment();

                    } else if (paymentChoice == 2) {

                        payment = new CardPayment();

                    } else if (paymentChoice == 3) {

                        payment = new CODPayment();

                    } else {

                        System.out.println("Invalid payment method.");
                        break;
                    }

                    payment.pay(amount);

                    break;


                case 11:

                    System.out.print(
                        "Enter Product ID for recommendations: "
                    );

                    int recommendationId = sc.nextInt();

                    recommendationEngine.recommend(
                        recommendationId
                    );

                    break;


                case 12:

                    System.out.println(
                        "Thank you for using our system!"
                    );

                    break;


                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 12);

        sc.close();
    }
}