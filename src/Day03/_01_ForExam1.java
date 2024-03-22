/**
 * Date : 2024.02.28
 * Author : inchoriya
 * Description : 별찍기 피라미드
 * Version : 1.0
 */

package Day03;

import java.util.Scanner;

public class _01_ForExam1 {
    public static void main(String[] args) {

        /*
           i <= 4
           i와 j와의 관계 : j <= (2*i)-1
           i와 k의 관계 : k <= 4-i

           @@@*@@@          i : 1 / j : 1 / k : 3
           @@***@@          i : 2 / j : 3 / k : 2
           @*****@          i : 3 / j : 5 / k : 1
           *******          i : 4 / j : 7 / k : 0

           i : 행
           j : 별
           k : 공백


         */

        Scanner sc = new Scanner(System.in);

        System.out.print("행의 갯수를 입력 >> ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){

            for(int k=1; k<=num-i; k++){
                System.out.print("@");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            for(int k=1; k<=num-i; k++){
                System.out.print("@");
            }

            System.out.println();

        }



    }
}
