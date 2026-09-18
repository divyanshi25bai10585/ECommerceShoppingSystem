// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class RecommendationEngine {

    public void recommend(int productId) {

        System.out.println("\n===== SMART RECOMMENDATIONS =====");

        if (productId == 101) {

            System.out.println("Recommended: Wireless Mouse");
            System.out.println("Recommended: Headphones");

        } else if (productId == 102) {

            System.out.println("Recommended: Laptop");
            System.out.println("Recommended: Headphones");

        } else if (productId == 103) {

            System.out.println("Recommended: Laptop");
            System.out.println("Recommended: Wireless Mouse");

        } else {

            System.out.println("No recommendations available.");
        }
    }
}
