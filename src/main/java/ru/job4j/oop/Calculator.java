package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        d = sum(3) + multiply(4)
                + minus(5) + divide(35);
        return d;
    }

    public static void main(String[] args) {
        int result = sum(25);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(25);
        System.out.println(result);
        result = minus(5);
        System.out.println(result);
        result = calculator.divide(35);
        System.out.println(result);
        result = calculator.sumAllOperation(0);
        System.out.println(result);
    }
}