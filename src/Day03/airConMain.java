package Day03;

import java.util.Scanner;

public class airConMain {

    // 필드

    // 생성자

    // 메소드
    public static void main(String[] args) {

        // 입력(Scanner)객체 생성
        Scanner sc = new Scanner(System.in);

        // airCon객체 생성
        airCon aircon = new airCon();

        // 객체의 맴버변수(필드)에 접근하는 방법 : 도트(.)연산자
        aircon.color = "white";
        aircon.price = 160;
        aircon.temp = 21;

        System.out.println("색상 : " + aircon.color);
        System.out.println("가격 : " + aircon.price);
        System.out.println("온도 : " + aircon.temp);

        System.out.println("회사 : " + aircon.company);
        System.out.println("크기 : " + aircon.size);

        System.out.println("메소드 실행(호출)!");
        // 전원 on
        aircon.onPower();

        // 현재온도
        System.out.println(aircon.curTemp());

        // 온도 -1
        aircon.downTemp();
        System.out.println(aircon.curTemp());

        // 온도 +1
        aircon.upTemp();
        System.out.println(aircon.curTemp());

        // 전원 off
        aircon.offPower();

    }

}
