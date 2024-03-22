/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 반복문 while
 * Version : 1.0
 */

package Day02;

public class _04_While {

    public static void main(String[] args) {
        /*
            [ while문 기본구조 ]

            (1)초기식
            while( (2)조건 ){

                (3)실행문
                (4)조건변경

            } (5)종료

        */
        int i = 1;
        int sum = 0;
        while(i<=10){
            sum += i;
            i++;
        }
        System.out.println(sum);

        // 주사위를 던져서 5가 나오면 종료되는 프로그램 만들기!
        // 프로그램을 실행하는 변수
        boolean run = true;

        // 주사위를 던진 횟수 구하는 변수
        int cnt = 0;

        // 주사위 값을 구하는 변수
        int dice = 0;

        // Math.random() 함수 사용 : 0.001 ~ 0.99999 사이의 랜덤한 실수
        // s부터 n까지 정수를 구하는 방법
        // (int)(Math.random() * n) + s

        while(run){

            dice = (int)(Math.random() * 6) + 1;
            System.out.println("주사위 값 : " + dice);

            // 카운트 증가
            cnt++;

            if(dice==5){
                run = false;
            }

        }

        System.out.println();
        System.out.println("던진 횟수 : " + cnt);
        System.out.println("프로그램을 종료합니다.");

    }


}
