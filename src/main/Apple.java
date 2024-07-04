package src.main;

public class Apple implements Phone{

    String customer;

    public Apple(String customer) {
        this.customer = customer;
    }

    @Override
    public void buy() {
        System.out.println(customer+"님이 애플폰을 구매했습니다.");
    }

    @Override
    public void turnOn() {
        System.out.println(customer+"님이 애플폰을 켰습니다.");
    }

    @Override
    public void printMsg() {
        System.out.println("@@@ 폰 켜지는 중 @@@\n");
    }
}
