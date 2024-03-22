/**
 * Date : 2024.02.26
 * Author : inchoriya
 * Description : Java & IntelliJ 설정
 * Version : 1.1
 */

package Day01;

import java.util.Scanner;

public class _08_IfExam {

    public static void main(String[] args) {
        // 국어, 영어, 수학 점수를 입력
        // 총점, 평균, 학점 구하기
        // A+ : 95~100(95점이상) // A  : 90~94 (90점이상)
        // B+ : 85~89 (85점이상) // B  : 80~84 (80점이상)
        // C+ : 75~79 (75점이상) // C  : 70~74 (70점이상)
        // D+ : 65~69 (65점이상) // D  : 60~64 (60점이상)
        // F  : 60점 미만

        Scanner sc = new Scanner(System.in);

        System.out.println("국어 점수");
        int kor = sc.nextInt();

        System.out.println("수학 점수");
        int mat = sc.nextInt();

        System.out.println("영어 점수");
        int eng = sc.nextInt();

        int total = kor + mat + eng;

        double avg = (double)total / 3.0;

        String grade;

        if(avg >= 90) {
            grade = "A" + (avg >= 95 ? "+" : "");
        } else if(avg >= 80) {
            grade = "B" + (avg >= 85 ? "+" : "");
        } else if(avg >= 70) {
            grade = "C" + (avg >= 75 ? "+" : "");
        } else if(avg >= 60) {
            grade = "D" + (avg >= 65 ? "+" : "");
        } else {
            grade = "F";
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        System.out.println("학점 : " + grade);





    }
}
