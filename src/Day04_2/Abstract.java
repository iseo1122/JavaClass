package Day04_2;

public abstract class Abstract {

    /*
        - 추상클래스
         : 구체적이지 않은 클래스
         : 추상메소드를 꼭 포함
         : 추상메소드는 반드시 자식클래스에 재정의!
     */

    // 일반메소드
    public void move(){

    }

    // 추상메소드
    public abstract void sound();

    // (1) { } 중괄호(구현부)가 없다. + 세미콜론(;) 추가
    // (2) public(접근제한자)과 void(데이터타입) 사이에 abstract 추가
    // => 추상메소드를 만들면 반드시 class에도 abstract를 추가




}
