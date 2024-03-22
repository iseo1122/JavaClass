/**
 * Date : 2024.02.26
 * Author : inchoriya
 * Description : Scanner 입력
 * Version : 1.0
 */
package Day01;


import java.util.Scanner;

public class _05_Scanner {
    public static void main(String[] args) {

        // 입력을 하기 위한 Scanner객체 생성
        Scanner sc = new Scanner(System.in);

        // 이름, 나이, 주소(동까지)를 입력받기 => 변수 생성
        String name;
        int age;
        String addr;

        System.out.print("이름 입력 >> ");
        name = sc.next();

        System.out.print("나이 입력 >> ");
        age = sc.nextInt();

        sc.nextLine().trim();   // trim() : 앞뒤 공백을 제거
        System.out.print("주소 입력 >> ");
        addr = sc.nextLine();
        
        // 출력까지
        System.out.println("=== 내정보 ===");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);


    }
}
