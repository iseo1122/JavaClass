package Day04;

public class Child extends Parent{

    // 필드
    int childVar = 20;
    
    // 생성자
    
    // 메소드
    void childMethod(){
        System.out.println("자식클래스 메소드");
    }

    // 오버라이딩
    @Override
    void parentMethod(int a, int b) {
        // 부모클래스의 메소드 내용을 실행
        super.parentMethod(a, b);
        
        // 부모클래스 메소드의 내용을 실행하지 않고 재정의
        System.out.println("부모클래스 메소드 내용 재정의");
    }

    // 오버로딩
    void abc(){

    }

    void abc(int a){

    }

    void abc(String b){

    }
    
    
    
    
}
