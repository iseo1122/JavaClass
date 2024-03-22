/**
 * Date : 2024.02.26
 * Author : inchoriya
 * Description : 조건문(if)
 * Version : 1.0
 */

package Day01;

public class _07_If {

    public static void main(String[] args) {

        // if : 만약에

/*
        if(조건1){
            조건1이 참일 경우 실행
        } else if(조건2) {
            조건2가 참일 경우 실행
        } else {
            조건1과 조건2가 모두 거짓일 경우 실행
        }

        조건 : 조건식과 조건변수
*/
        // (1) 조건식
        if(10>20){
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }

        // (2) 조건변수
        boolean checked = true;

        if(checked){
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }

        String id = "icia";
        int pw = 1234;

        if(id.equals("icia") && pw == 1234){
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패!");
        }




    }
}
