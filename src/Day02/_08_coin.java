/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 동전 예제
 * Version : 1.0
 */

package Day02;

import java.util.Scanner;

public class _08_coin {
    public static void main(String[] args) {

        // Q. 동전 갯수를 구하는 예제
        // 어떤 금액을 입력하면
        // 각 동전이 몇개씩 필요한지 출력하는 문제

        // ex) 2680원
        // 500원 : 5개
        // 100원 : 1개
        // 50원  : 1개
        // 10원  : 3개

        int[] coin = {500, 100, 50, 10};
        // 규칙을 찾아서 배열을 사용해서 문제를 해결하시오.
        // 2680	- (500 x 5) = 180

        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요 >> ");
        int money = sc.nextInt();

        for(int i=0; i< coin.length; i++){
            int count = money / coin[i];    // 해당 동전의 갯수 구하기
            money %= coin[i];               // 해당 동전을 뺀 나머지 금액
            System.out.println(coin[i] + "원 동전 갯수 : " + count);
        }



    }
}
