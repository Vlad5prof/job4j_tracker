package ru.job4j.oop;

class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball go to");
        } else System.out.println("Ball to eat");
    }
}

class Hare {
    public void tryEat(Ball ball) {
        ball.tryRun(true);
    }
}

class Wolf {
    public void tryEat(Ball ball) {
        ball.tryRun(true);
    }
}

class Fox {
    public void tryEat(Ball ball) {
        ball.tryRun(false);
    }
}

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}


