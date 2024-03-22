package Day03;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

//        // Car객체 생성
//        // car1은 기본생성자를 사용해서 객체 생성
//        Car car1 = new Car();
//        car1.company = "테슬라";
//        car1.color = "검정";
//        car1.speed = 200;
//        car1.type = "전기";
//        car1.model = "모델X";
//
//        // car2 매개변수를 사용해서 객체 생성
//        Car car2 = new Car("테슬라", "검정", 200, "전기", "모델X");
//
//        //System.out.println("출석번호 : " + ((int)(Math.random() * 13) + 1) +"번");
//
//        Car jsCar = new Car("마쓰다", "빨강", 195, "가솔린", "mx05");
//        jsCar.carInfo();
//
//        jsCar.drive();
//        jsCar.setGas(10);
//
//        jsCar.drive();
        
        // 프로그램화 : switch , while문 활용
        // [1] 자동차 정보 입력 : 기본생성자 or 매개변수생성자
        // [2] 자동차 정보 확인 : carInfo()
        // [3] gas 충전 : setGas()
        // [4] 운행 : drive()
        // [5] 종료

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int menu = 0;
        Car myCar = new Car();

        while(run){
            System.out.println("=================================================");
            System.out.println("1.정보입력 | 2.내차정보 | 3.gas충전 | 4.운행 | 5.종료");
            System.out.println("=================================================");
            System.out.print("선택 >> ");
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.print("제조사 >> ");
                    String company = sc.next();

                    System.out.print("색상 >> ");
                    String color = sc.next();

                    System.out.print("최고속도 >> ");
                    int speed = sc.nextInt();

                    System.out.print("타입 >> ");
                    String type = sc.next();

                    System.out.print("모델명 >> ");
                    String model = sc.next();

                    myCar = new Car(company, color, speed, type, model);
                    break;
                case 2:
                    myCar.carInfo();
                    break;
                case 3:
                    System.out.print("gas를 얼마만큼 충전할까요? ");
                    myCar.setGas(sc.nextInt());
                    break;
                case 4:
                    myCar.drive();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
                    break;
            }

        }


        

    }
}
