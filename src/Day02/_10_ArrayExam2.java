/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 배열 예제2
 * Version : 1.0
 */
package Day02;

import java.util.Scanner;

public class _10_ArrayExam2 {

    public static void main(String[] args) {

        // 배열을 사용한 성적입력 프로그램 만들기
        // while문 , switch문 사용

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int menu = 0;

        // 학생수를 입력받기 위한 변수
        int stuNum = 0;

        // 점수를 입력받기 위한 배열(빈 배열)
        int[] scores = null;

        while(run){
            System.out.println("====================================================");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수출력 | 4.점수분석  | 5.종료");
            System.out.println("====================================================");
            System.out.print("선택 >> ");
            menu = sc.nextInt();

            switch (menu){
                case 1:     // 학생수 : 몇명 학생의 성적을 처리할지
                    System.out.print("학생수 입력 >> ");
                    stuNum = sc.nextInt();
                    break;
                case 2:     // 점수입력(학생수만큼)
                    // (1)학생수(크기)만큼 배열 생성
                    scores = new int[stuNum];

                    // (2)점수를 입력하기 위한 배열의 크기만큼 반복문 실행
                    for(int i=0; i<scores.length; i++){
                        System.out.print((i+1) + "번 학생 점수 입력 >> ");
                        scores[i] = sc.nextInt();
                    }

                    break;
                case 3:     // 점수출력(학생수만큼)
                    for(int i=0; i<scores.length; i++){
                        System.out.println((i+1) + "번 학생 점수 : " +  scores[i]);
                    }
                    break;
                case 4:     // 점수분석 : 총점, 평균, 최고점수
                    int sum = 0;
                    double avg = 0;
                    int max = 0;
                    int idx = 0;

                    for(int i=0; i<scores.length; i++){
                        // 총점
                        sum += scores[i];

                        // 최고점수
                        if(scores[i] > max){
                            max = scores[i];
                        }

                        // 최고점수를 받은 학생
                        if(max==scores[i]){
                            idx = i + 1;
                        }
                    }

                    // 평균
                    avg = (double) sum / scores.length;
                    avg = Math.round(avg * 10) / 10.0;  // 소숫점 첫째자리까지 반올림

                    System.out.println("총점 : " + sum);
                    System.out.println("평균 : " + avg);
                    System.out.println("최고점수 : " + max + "점(" + idx +"번 학생)");

                    break;
                case 5:     // 종료
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:    // 그외
                    System.out.println("잘못 입력했습니다.");
                    break;
            }

        }






    }





}
