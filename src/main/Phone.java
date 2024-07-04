package src.main;

public interface Phone {

    void buy();
    void turnOn();
    void printMsg();
    default void buyProcess(){
        buy();
        turnOn();
        printMsg();
    }

}
