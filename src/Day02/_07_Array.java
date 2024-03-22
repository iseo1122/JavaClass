/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 배열
 * Version : 1.0
 */

package Day02;

public class _07_Array {

    public static void main(String[] args) {

        // 배열(array) : 같은 타입의 데이터를 하나의 변수에 저장하는 구조
        // 선언과 할당
        String[] icia = {"인", "천", "일", "보", "아", "카", "데", "미"};

        // icia 배열의 값을 각각 출력하시오.
        // 반복문과 배열의 크기를 이용해서 출력가능
        for(int i=0; i< icia.length; i++){
            //System.out.print(icia[i]);
        }

        // Java, DB, HTML 과목의 점수를 배열에 저장하고
        // 세과목의 총점과 평균을 구하시오
        // 90, 80, 84
        // int[] score
        // score[0], score[1], score[2] 사용금지!
        // 나누기 3 사용금지

        int[] score = {90, 80, 84};
        int sum = 0;
        double avg = 0;

        for(int i=0; i<score.length; i++){
            // 각 과목의 점수
            System.out.println("score[" + i + "] : " + score[i]);

            // 세 과목의 합
            sum += score[i];
        }

        System.out.println("총점 : " + sum + "점");


        avg = (double) sum / score.length;
        System.out.println("평균 : " + avg + "점");

        // 평균(소숫점 둘째자리까지 반올림) : 84.67점
        avg = (Math.round(avg * 100) / 100.0);

        // avg * 100 = 8466.6666666667
        // Math.round(8466.6666666667) = 8467.0
        // 8467.0 / 100.0 = 84.67
        System.out.println(avg);

    }

}




