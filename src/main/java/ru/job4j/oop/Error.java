package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Количество исправлений " + active);
        System.out.println("Исправлено " + status);
        System.out.println("Найдено " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 29, "Error");
        error.printInfo();
        System.out.println("---------------------------------");
        Error noterror = new Error(false, 0, "NotError");
        noterror.printInfo();
        System.out.println("---------------------------------");
        Error third = new Error();
        third.printInfo();
    }
}