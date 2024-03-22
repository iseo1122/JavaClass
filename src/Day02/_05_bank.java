/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : bank 예제
 * Version : 1.0
 */

package Day02;

import java.util.Scanner;

public class _05_bank {

    public static void main(String[] args) {

        // 입력을 받기 위한 Scanner 객체
        Scanner sc = new Scanner(System.in);

        // 프로그램을 실행하기 위한 변수
        boolean run = true;

        // 메뉴 선택을 위한 변수
        int menu = 0;

        // 계좌 금액 변수
        int balance = 0;

        while(run){

            System.out.println("=============================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("=============================");
            System.out.print("선택 >> ");
            menu = sc.nextInt();

            switch (menu){
                case 1:     // 예금
                    System.out.print("입금액 >> ");
                    int amount = sc.nextInt();
                    balance += amount;
                    
                    break;

                case 2:     // 출금
                    System.out.print("출금액 >> ");
                    amount = sc.nextInt();

                    if(balance >= amount){  // 잔액이 출금액보다 많을 경우(같을 경우)
                        balance -= amount;
                    } else {
                        System.out.println("잔액이 " + (amount-balance) + "원 부족합니다.");
                    }

                    break;

                case 3:     // 잔액조회
                    System.out.println("잔액 : " + balance + "원");
                    break;

                case 4:     // 종료
                    run = false;
                    System.out.println("이용해 주셔서 감사합니다.");
                    break;

                default:    // 그외
                    System.out.println("잘못 입력했습니다.");
                    break;
            }

        }






    }
}




