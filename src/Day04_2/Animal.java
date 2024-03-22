package Day04_2;

public abstract class Animal {

    // 일반메소드
    public void breathe(){
        System.out.println("숨을 쉬다");
    }

    // 추상메소드 : 메소드를 선언만 한 것! 내용x
    public abstract void sound();

}
