package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.println(this.name
                + " there is cat's food: " + this.food);
    //    System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

        public static void main(String[] args) {
    //    System.out.print("There is gav's food   ");
        Cat gav = new Cat();
        gav.giveNick("GAV");
        gav.eat("cutlet");
        gav.show();
    //    System.out.print("There is black's food   ");
        Cat black = new Cat();
        black.giveNick("BLACK");
        black.eat("fish");
        black.show();
    /*    System.out.println("------------------------");
        Cat pappy = new Cat();
        Cat sparky = new Cat();
        pappy.giveNick("Pap");
        pappy.eat("milk");
        pappy.show();
        String say = pappy.sound();   //"Gav"
        System.out.println("   " + say);   */
    }
}