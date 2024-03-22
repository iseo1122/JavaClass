package Day03;

public class airCon {
    
    // 클래스의 3요소
    
    // (1) 필드 : 명사형, 값의 상태 관리, 데이터 저장..
    String company;     // 제조회사
    String color;       // 색상
    int price;          // 가격
    int size;           // 크기
    int temp;           // 현재온도

    // (2) 생성자

    // 기본 생성자
    public airCon() {

    }

    // 매개변수 생성자
    public airCon(String company, String color, int price, int size, int temp) {
        this.company = company;
        this.color = color;
        this.price = price;
        this.size = size;
        this.temp = temp;
    }

    // 매개변수 생성자를 만들때 주의사항
    // (1) 매개변수의 갯수가 다르거나
    // (2) 데이터타입이 달라야 한다.
    public airCon(String company, String color) {
        this.company = company;
        this.color = color;
    }

    public airCon(String company, int price) {
        this.company = company;
        this.price = price;
    }

    public airCon(int size, String company) {
        this.company = company;
        this.size = size;
    }

    // 생성자 오버로딩 : 한 클래스에서 같은 이름의 생성자를 여러개 사용하되
    // 매개변수의 타입이나 갯수를 다르게 해서 다양한 방법으로 객체를 생성하는 방법

    // (3) 메소드
    void onPower(){
        System.out.println("에어컨 On!");
    }

    void offPower(){
        System.out.println("에어컨 Off!");
    }

    int upTemp(){
        temp++;
        return temp;
    }

    int downTemp(){
        temp--;
        return temp;
    }

    String curTemp(){
        return "현재 온도는 " + temp +"도 입니다.";
    }
    
}
