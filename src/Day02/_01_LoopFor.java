/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 반복문 for문
 * Version : 1.0
 */

package Day02;

import java.util.Scanner;

public class _01_LoopFor {

    public static void main(String[] args) {

        // 1부터 10까지 반복문 for문을 사용해서 출력하시오!
        for(int i=1; i<=10; i++){
            // System.out.println(i);
        }

        /*
		[반복문 for문의 기본구조] : 2,3,4 반복

		for( (1)초기식 ; (2)조건식 ; (4)증감식 ){

			(3)반복할 수행문

		} (5)반복문 종료

		*/

        // 입력한 숫자 s부터 입력한 숫자 n까지 합을 구하여라.
        // 2와 5를 입력할 경우
        // 2 + 3 + 4 + 5 = 14 가 출력되도록 만드시오.

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 >> ");
        int s = sc.nextInt();

        System.out.print("두번째 숫자 >> ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=s; i<=n; i++){

            sum += i;

//            if(i < n){
//                System.out.print(i + " + ");
//            } else {
//                System.out.print(i + " = ");
//            }

            System.out.print(i + (i<n ? " + " : " = "));
        }

        System.out.println(sum);



    }
}






