package org.progsoc.java2025.basics;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Mazda" };

        // Accessing an item
        System.out.println(cars[0]); // Volvo

        // Changing an element of an array
        cars[0] = "Ford";
        System.out.println(cars[0]); // Ford

        // Getting the length of the array
        int carsLength = cars.length;
        System.out.println(carsLength); // 3
    }
}
