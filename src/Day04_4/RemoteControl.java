package Day04_4;

public interface RemoteControl {
    /*
        - 인터페이스 구조

        public interface 인터페이스이름 {

            // 필드
            public static final 데이터타입 상수이름;

            // 메소드
            public abstract 데이터타입 메소드이름();

        }
        
        - 특징
        (1) 누구나 접근이 가능하도록 public
        (2) 객체의 다형성 구현하는데 용이
        
        - 구성요소
        (1) 상수 필드
         : 일반적인 필드로 선언해도 컴파일 과정에서 static final이 자동으로 붙음
           ex) int num=10;  ==> static final int num = 10;

        (2) 추상 메소드
         : 일반적인 메소드를 선언해도 컴파일 과정에서 abstract가 자동으로 붙음
         : { 구현부 } 없이 메소드 이름만 선언하고 세미콜론(;)을 작성한다.

        (3) default 메소드
         : { 구현부 } 를 가지는 메소드
         : 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위함

        (4) static 메소드
         : 인터페이스를 객체화 하지 않고도 직접 호출 가능

        - 인터페이스 객체 = new 구현클래스();
        - interface → interface 상속 : extends 사용
        - interface → class : implements 사용(여러개 사용가능)
     */

    // (1)상수필드 : static을 사용하지 않아도 자동을 붙음
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // (2)추상메소드 : abstract를 사용하지 않아도 자동으로 붙음
    // interface                        // class
    void turnOn();                      // abstract void turnOn();
    void turnOff();
    void setVolume(int volume);

    // (3)default(일반)메소드
    public default void setMute(boolean mute){
        if (mute){
            System.out.println("음소거 합니다.");
        } else {
            System.out.println("음소거를 해제합니다.");
        }
    }

    // (4)static 메소드
    public static void changeBattery(){
        System.out.println("건전지를 교체해주세요.");
    }





}













