/**
 * Date : 2024.02.28
 * Author : inchoriya
 * Description : 2차원 배열 영단어 맞추기
 * Version : 1.0
 */
package Day03;

import java.util.Scanner;

public class _03_WordGame {
    public static void main(String[] args) {
        // 영단어 맞추기 게임

        // String[][] words
        // words[i][3]
        // i는 문제수
        // j가 0:단어 , 1:뜻, 2:예문

        // 1. while문과 switch을 사용해서 프로그램 구성
        // 2. 문제 갯수를 입력
        // 3. 문제, 뜻, 예문 입력
        // 4. 맞춘 갯수를 가지고 정답률 계산
        // 5. 메뉴 (1)문제수 (2)문제출제 (3)문제풀기 (4)점수분석 (5)종료

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int menu = 0;

        // 문제수를 입력받기 위한 변수
        int qNum = 0;

        // 문제, 뜻, 예문을 입력받기 위한 배열(빈배열)
        String[][] words = null;

        // 정답 갯수
        int score = 0;

        while(run){
            System.out.println("=====================================================");
            System.out.println("1.문제수 | 2.문제출제 | 3.문제풀기 | 4.점수분석  | 5.종료");
            System.out.println("=====================================================");
            System.out.print("선택 >> ");
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.print("문제수 입력 >> ");
                    qNum = sc.nextInt();
                    break;
                case 2:
                    // 배열 초기화
                    words = new String[qNum][3];

                    for(int i=0; i<words.length; i++){
                        System.out.print((i+1) + "번 단어 >> ");
                        words[i][0] = sc.next();

                        System.out.print((i+1) + "번 뜻 >> ");
                        words[i][1] = sc.next();

                        sc.nextLine().trim();
                        System.out.print((i+1) + "번 예문 >> ");
                        words[i][2] = sc.nextLine();

                        System.out.println();
                    }
                    break;
                case 3:
                    score = 0;

                    for(int i=0; i< words.length; i++){
                        System.out.print((i+1) + "번 문제. " + words[i][0] + "의 뜻은? ");
                        String answer = sc.next();

                        if(answer.equals(words[i][1])){
                            System.out.println("정답입니다.");
                            score++;
                        } else {
                            System.out.println("틀렸습니다. 정답은 " + words[i][1] + " 입니다.");
                        }
                        System.out.println("(예문)" + words[i][2] + "\n");

                    }
                    break;
                case 4:
                    System.out.println("맞춘 갯수는 " + score + "개");

                    double percent = ((double) score / words.length ) * 100;
                    System.out.println("정답률은 " + percent + "% 입니다.");

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
