package com.example.calculator;

public class SimpleCalculator {
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double divide(int a, int b, int c) {
        if (b == 0 || c == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b / c;
    }
}