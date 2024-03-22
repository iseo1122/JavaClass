package Day01;

import java.util.Scanner;

public class _06_Exam1 {

    public static void main(String[] args) {
        // Q.

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        String result;

        // (1) 두 정수를 입력받아서
        System.out.print("숫자1 입력 >> ");
        num1 = sc.nextInt();

        System.out.print("숫자2 입력 >> ");
        num2 = sc.nextInt();

        // (2) 두 수의 합이
        num3 = num1 + num2;

        // (3) 짝수인지 홀수인지 출력하세요!
        // 변수 = (조건식) ? 참일때 값 : 거짓일때 값;
        result = (num3 % 2 == 0) ? "짝수" : "홀수";

        System.out.println("두수의 합은 " + num3 + "이고, " + result + "입니다.");

        // Hint.
        // 항이 3개인 삼항연산자
        // 변수 = (조건식) ? 참일때 값 : 거짓일때 값;
    }
}
