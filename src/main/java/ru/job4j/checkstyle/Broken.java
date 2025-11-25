package ru.job4j.checkstyle;

public class Broken {
    String name;

    Broken() {
    }

    void echo() {
    }

    private int sizeOfEmpty = 10;
    public String surname;
    public static String newValue = "   ";

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {
    }
}