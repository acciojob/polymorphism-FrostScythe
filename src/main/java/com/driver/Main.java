package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main class
    static class Product {

        // Task 3: Method with two int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function
        Product p = new Product();

        // Call product(int, int)
        int result1 = p.product(3, 4);
        System.out.println("Product of 3 and 4 is: " + result1);

        // Call product(int, int, int)
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3 and 4 is: " + result2);

        // Call product(double, double)
        double result3 = p.product(2.5, 4.0);
        System.out.println("Product of 2.5 and 4.0 is: " + result3);
    }
}
