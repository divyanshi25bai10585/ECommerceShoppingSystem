// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585

import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();

        products.add(
            new Product(101, "Laptop", 55000, 10)
        );

        products.add(
            new Product(102, "Wireless Mouse", 799, 25)
        );

        products.add(
            new Product(103, "Headphones", 1499, 15)
        );
    }

    public void displayProducts() {

        System.out.println("\n========== AVAILABLE PRODUCTS ==========");

        for (Product product : products) {
            product.displayProduct();
        }
    }

    public void searchProduct(String keyword) {

        boolean found = false;

        for (Product product : products) {

            if (product.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                product.displayProduct();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }
    public Product getProductById(int id) {

    for (Product product : products) {

        if (product.getProductId() == id) {
            return product;
        }
    }

    return null;
}
}