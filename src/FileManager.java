// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    private String fileName = "../data/orders.txt";

    public void saveOrder(int orderId, double amount) {

        try {

            FileWriter writer = new FileWriter(fileName, true);

            writer.write(
                "Order ID: " + orderId +
                " | Amount: Rs." + amount +
                "\n"
            );

            writer.close();

            System.out.println("Order saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving order.");
        }
    }
}