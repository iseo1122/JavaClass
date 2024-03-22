/**
 * Date : 2024.02.27
 * Author : inchoriya
 * Description : 2차원배열
 * Version : 1.0
 */
package Day02;

public class _11_2array {
    public static void main(String[] args) {
        // 2차원 배열
        // 타입[][] 배열이름 = new 타입[i][j];
        // i : 행 , j : 열

        int[][] numbers = {
                {0, 1, 2},
                {3, 4, 5}
                          };

//        System.out.println("numbers[0][0] : " + numbers[0][0]);
//        System.out.println("numbers[0][1] : " + numbers[0][1]);
//        System.out.println("numbers[0][2] : " + numbers[0][2]);
//
//        System.out.println("numbers[1][0] : " + numbers[1][0]);
//        System.out.println("numbers[1][1] : " + numbers[1][1]);
//        System.out.println("numbers[1][2] : " + numbers[1][2]);

        /*
            2차원 배열을 반복문으로 출력하기!

            for(i(행)에 관해서 작성) {

                for(j(열)에 관해서 작성) {
                    출력문 작성!
                }

            }
        */

        // i : 2, j : 3
        for(int i=0; i<numbers.length; i++){

            for(int j=0; j<numbers[i].length; j++){
                System.out.println("numbers[" + i + "][" + j + "] = " + numbers[i][j]);
            }

        }

        System.out.println("numbers[i][j]의 2차원 배열크기");
        System.out.println("numbers.length(i크기) : " + numbers.length);
        System.out.println("numbers[0].length(j크기) : " + numbers[0].length);
        System.out.println("numbers[1].length(j크기) : " + numbers[1].length);

    }
}
