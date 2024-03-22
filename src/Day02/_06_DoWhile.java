/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : do-while문
 * Version : 1.0
 */

package Day02;

import java.util.Scanner;

public class _06_DoWhile {

    public static void main(String[] args) {

        // while문과 do-while문의 차이점
        // [1] while문 : 반복문을 실행하기 전에 조건식 검사
        // [2] do-while문 : 반복문을 실행한 후에 조건식 검사(무조건 한번은 실행)
        
        /*
        
            do {
                
                반복문 실행
            
            } while(반복조건);
        
         */

        Scanner sc = new Scanner(System.in);

        // 정답 : 1부터 45사이의 랜덤한 숫자
        int answer = (int)(Math.random() * 45) + 1;
        int input = 0;
        int cnt = 0;

        boolean run = true;

        System.out.println("Up & Down 게임 시작!");

        do {

            System.out.print("1부터 45사이의 숫자를 입력 >> ");
            input = sc.nextInt();
            cnt++;

            if(input > answer){
                System.out.println("Down! 더 작은 수를 입력하세요.\n");
            } else if(input < answer){
                System.out.println("Up! 더 큰 수를 입력하세요.\n");
            } else {
                run = false;
                System.out.println("정답은 " + answer + ", 시도한 횟수는 " + cnt + "번\n");
            }

        } while(run);

        if(cnt <=3){
            System.out.println("통과!");
        } else {
            System.out.println("벌칙!");
        }
    }
}






