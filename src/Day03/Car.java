package Day03;

public class Car {

    // 클래스 3요소
    // 필드 : 제조회사(company), 색상(color), 최고속도(speed), 연료타입(type), 모델명(model)
    String company;
    String color;
    int speed;
    String type;
    String model;



    // 생성자 : 기본생성자, 매개변수생성자(모든필드)

    public Car() {
    }

    public Car(String company, String color, int speed, String type, String model) {
        this.company = company;
        this.color = color;
        this.speed = speed;
        this.type = type;
        this.model = model;
    }

    // 메소드 : 자동차 정보를 확인하는 메소드(carInfo())
    void carInfo(){
        System.out.println("제조사 : " + company);
        System.out.println("색상 : " + color);
        System.out.println("타입 : " + type);
        System.out.println("최고속도 : " + speed);
        System.out.println("모델명 : " + model);
    }

    // 필드 추가
    int gas;

    // 메소드 추가

    // gas충전 메소드
    void setGas(int gas){
        this.gas = gas;
    }

    // 주행 메소드
    void drive(){
        boolean run = isLeftGas();

        while(run){
            if(gas > 0){
                System.out.println("주행합니다.(gas잔량 : " + gas +")");
                gas--;
            } else {
                System.out.println("멈춥니다.(gas잔량 : " + gas +")");
                run = false;
            }
        }


    }

    // 연료확인 메소드
    boolean isLeftGas(){
        if(gas != 0){
            System.out.println("gas가 " + gas + "만큼 남아있습니다.");
            return true;
        } else {
            System.out.println("gas가 없습니다.");
            return false;
        }
    }

}
