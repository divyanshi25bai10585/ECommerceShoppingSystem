// Student: DIVYANSHI UPADHYAY
// Registration No.: 25BAI10585
// Project: E-Commerce Shopping and Order Management System

public class User {

    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void displayUser() {
        System.out.println("Welcome, " + name + "!");
    }
}