/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : continue
 * Version : 1.0
 */

package Day02;

public class _02_continue {
    public static void main(String[] args) {
        // continue문 -> 반복문에서 사용
        // 반복문 안에서 continue문을 만나면
        // 이후 문장을 실행하지 않고 for문의 증감식으로 이동한다.

        // Q. 1부터 10까지 홀수만 출력!
        for(int i=1; i<=10; i++){

            if(i%2==0){
                continue;
            }

            System.out.println(i);

        }
    }
}
