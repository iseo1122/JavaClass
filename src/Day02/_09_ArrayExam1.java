/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 배열 예제1
 * Version : 1.0
 */

package Day02;

import java.util.Scanner;

public class _09_ArrayExam1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q. 3개의 정수를 입력받아서 가장 큰 수를 찾기!
        // 크기가 3인 배열 arrInt를 만들어서 구하기!
        int[] arrInt = new int[3];

        // 가장 큰 수를 찾기 위한 변수
        int max = 0;

        for(int i=0; i< arrInt.length; i++){
            System.out.print((i+1)+"번 숫자 입력 >> ");
            arrInt[i] = sc.nextInt();

            if(arrInt[i] > max){
                max = arrInt[i];
            }
        }

        System.out.println("가장 큰 수는 " + max + " 입니다.");

    }
}
