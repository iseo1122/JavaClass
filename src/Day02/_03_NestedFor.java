/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 중첩 for문
 * Version : 1.0
 */

package Day02;

public class _03_NestedFor {
    public static void main(String[] args) {

        /*
            for( (1)초기식 ; (2)조건식 ; (4)증감식 ){

			    for( (1)초기식 ; (2)조건식 ; (4)증감식 ){

			            (3)반복할 수행문

		        } (5)반복문 종료

		    } (5)반복문 종료

         */

        // 중첩 for문 예제1.
        // i와 j를 사용해서 구구단을 만들어보자!
        for(int i=2; i<=9; i++){    // 2단부터 9단까지 반복
            //System.out.println("=== " + i + "단 ===");

            for(int j=1; j<=9; j++){    // 각 단의 1부터 9까지 곱셈을 반복
                //System.out.println(i + " x " + j + " = " + (i*j));
            }

            //System.out.println();   // 단과 단 사이를 구분하기 위해 줄바꿈
        }

        /*
        i : 행
        j : 별

        i = 1 , j = 1
        i = 2 , j = 2
        i = 3 , j = 3
        i = 4 , j = 4

        *
        **
        ***
        ****

        */

        for(int i=1; i<=7; i++){        // 각 행에 대한 반복문

            for(int j=1; j<=i; j++){    // 별의 갯수에 대한 반복문
                System.out.print("*");
            }

            System.out.println();       // 행이 끝난 후 줄바꿈

        }

    }
}
