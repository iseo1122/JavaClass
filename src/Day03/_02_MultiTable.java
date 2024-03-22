/**
 * Date : 2024.02.28
 * Author : inchoriya
 * Description : 2차원 배열 구구단
 * Version : 1.0
 */
package Day03;

public class _02_MultiTable {
    public static void main(String[] args) {
        // i : 2~9
        // j : 1~9

//        int[][] multi = new int[10][10];
//        // i : 0~9, j : 0~9
//
//        for(int i=2; i< multi.length; i++){
//            System.out.println("=== " + i + "단 ===");
//
//            for(int j=1; j<multi[i].length; j++){
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//
//            System.out.println();
//        }

        int[][] multi = new int[8][9];

        for(int i=0; i< multi.length; i++){
            System.out.println("=== " + (i+2) + "단 ===");

            for(int j=0; j<multi[i].length; j++){
                System.out.println((i+2) + " x " + (j+1) + " = " + ((i+2)*(j+1)));
            }

            System.out.println();
        }

    }
}
