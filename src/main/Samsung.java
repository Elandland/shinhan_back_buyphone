package src.main;

public class Samsung implements Phone{

    String customer;

    public Samsung(String customer) {
        this.customer = customer;
    }

    @Override
    public void buy() {
        System.out.println(customer+"님이 삼송폰을 구매했습니다.");
    }

    @Override
    public void turnOn() {
        System.out.println(customer+"님이 삼송폰을 켰습니다.");
    }

    @Override
    public void printMsg() {
        System.out.println("*** 폰 켜지는 중 ***\n");
    }

}
