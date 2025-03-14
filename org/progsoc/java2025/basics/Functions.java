package org.progsoc.java2025.basics;

public class Functions {
    public static boolean isEven(int val) {
        return (val % 2) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4)); // true
        System.out.println(isEven(7)); // false
        System.out.println(isEven(8)); // true
    }
}
