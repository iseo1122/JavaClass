/**
 * Date : 2024.02.26
 * Author : inchoriya
 * Description : 연산자
 * Version : 1.0
 */

package Day01;

public class _04_Operation {

    public static void main(String[] args) {
        // 연산자 : 프로그래밍에서 변수나 값의 연산을 위해 사용되는 부호
        // 수학시간 + , - , x , / 등등

        // [1] 단항연산자 : 항이 1개인 연산자
        // ex) 증감연산자
        // 증가(++)
        // 감소(--)
        int num = 5;
        System.out.println("num : " + num);         // 5
        System.out.println("num++ : " + num++);     // 5
        System.out.println("num : " + num);         // 6
        System.out.println("++num : " + ++num);     // 7

        // num++ : num이 가지고 있는 값을 연산에 적용한 뒤에 1을 증가
        // ++num : num이 가지고 있는 값에 1을 증가한 뒤에 연산에 적용


        // [2] 이항연산자 : 항이 2개인 연산자
        // ex) 대입연산자, 산술연산자, 관계연산자, 논리연산자

        // 논리연산자 : AND연산(&&), OR연산(||), NOT연산(!)

        boolean result;

        // (1) AND연산 : &&
        // A && B : A와 B가 모두 true일 경우에 결과가 true
        // A, B중에 하나라도 false가 있으면 결과는 false

        result = true && true;
        System.out.println("true && true 결과 : " + result);

        result = true && false;
        System.out.println("true && false 결과 : " + result);

        result = false && false;
        System.out.println("false && false 결과 : " + result);

        // (2) OR연산 : ||
        // A || B : A와 B가 모두 false일 경우에 결과가 false
        // A, B중에 하나라도 true가 있으면 결과는 true
        result = true || true;
        System.out.println("true || true 결과 : " + result);

        result = true || false;
        System.out.println("true || false 결과 : " + result);

        result = false || false;
        System.out.println("false || false 결과 : " + result);

        // (3) NOT연산자 : !
        // boolean타입의 변수 앞에 사용하면 true가 false로,
        // false가 true로 변한다
        System.out.println("!false : " + !false);
        System.out.println("!true : " + !true);


        // [3] 삼항연산자 : 항이 3개인 연산자
        // ex) 조건연산자

    }
}











