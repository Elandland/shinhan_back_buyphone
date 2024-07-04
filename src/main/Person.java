package src.main;

public class Person{

    private String name;
    private Phone phone;

    public Person(String name) {
        this.name = name;
    }

    public void buy(Phone phone){
        this.phone = phone;
        phone.buy(name);

    }

    public void turnOn(Phone phone){
        this.phone = phone;
        phone.turnOn(name);
    }


}
