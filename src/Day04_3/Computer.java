package Day04_3;

public abstract class Computer {

    // 일반메소드
    void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    void turnOff(){
        System.out.println("전원을 끕니다.");
    }

    // 추상메소드
    public abstract void display();
    public abstract void typing();




}
