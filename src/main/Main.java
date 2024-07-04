package src.main;

public class Main {
    public static void main(String[] args) {

        Samsung samsung = new Samsung();
        Apple apple = new Apple();
        Person jobs = new Person("잡스");
        Person jae = new Person("재용");

        jobs.buy(apple);
        jobs.turnOn(apple);
        apple.printMsg();
        jae.buy(samsung);
        jae.turnOn(samsung);
        samsung.printMsg();
    }
}
