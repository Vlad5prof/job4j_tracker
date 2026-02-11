package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball go to");
        } else {
            System.out.println("Ball is eaten");
        }
    }
}