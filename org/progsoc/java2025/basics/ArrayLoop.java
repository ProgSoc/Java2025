package org.progsoc.java2025.basics;

public class ArrayLoop {
    public static void main(String[] args) {
        double[] numbers = { 1, 2, 3, 4 };

        // Start with zero
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            // Add up each number in the array onto sum
            sum = sum + numbers[i];
        }

        // Divide by the number of items to get the average
        double average = sum / numbers.length;

        System.out.println("Average: " + average); // 2.5
    }
}
