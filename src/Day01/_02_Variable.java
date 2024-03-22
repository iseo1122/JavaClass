/**
 * Date : 2024.02.26
 * Author : inchoriya
 * Description : 변수(variable)
 * Version : 1.0
 */

package Day01;

public class _02_Variable {

    public static void main(String[] args) {
        System.out.println("변수");
        // 변수(variable) : 프로그램 실행에 필요한 데이터를 저장하기 위해
        //                  메모리 [공간을 할당]하고 [이름을 부여]한 것!

        int age = 20;
        // [타입] [이름] = [값];

        int age1;   // 선언
        age1 = 30;  // 할당


        /*
            데이터 타입(기본형)
            [1] 정수형 : 소숫점이 존재하지 않는 숫자
            [2] 실수형 : 소숫점이 존재하는 숫자
            [3] 문자형 : 문자 한글자
            [4] 논리형 : 참/거짓을 판별하는 타입

            컴퓨터 언어 : 0과 1로 전달(1bit)
            (1) 1byte : 8bit(-128 ~ 127)
            (2) 2byte : 16bit(-32768 ~ 32767)
            (3) 4byte : 약 -21억 ~ 21억
            (4) 8byte :

            범위       :  1byte       2byte       4byte       8byte
            [1] 정수형 :   byte        short       int         long
            [2] 실수형 :                           float       double
            [3] 문자형 :               char
            [4] 논리형 :   boolean

        */

        char ch1 = 'A';

        System.out.println(ch1);
        System.out.println((int)ch1);   // 65
        System.out.println((int)'B');   // 66
        System.out.println((int)'가');  // 44032

        // 아스키코드
        // Q. 본인 이름을 아스키코드로 바꿔보시오.
        // 이름 한글자씩 char 변수에 담아서 진행한다.
        char c1 = '황';
        char c2 = '인';
        char c3 = '철';
        System.out.println((int)c1);   // 54889
        System.out.println((int)c2);   // 51064
        System.out.println((int)c3);   // 52384
        
        int n1 = 54889;
        int n2 = 51064;
        int n3 = 52384;
        System.out.println((char)n1);   // 황
        System.out.println((char)n2);   // 인
        System.out.println((char)n3);   // 철



    }

}









