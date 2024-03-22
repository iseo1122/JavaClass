/**
 * Date : 2024.02.28
 * Author : inchoriya
 * Description : 조만들기
 * Version : 1.0
 */

package Day03;

public class _04_Group {
    public static void main(String[] args) {
        // 2차원 배열을 사용해서 조 만들기

        String[] stu = { "강지우", "김보겸", "김은채", "김제유", "서종범",
                         "안도혁", "유기민", "윤하경", "이상혁", "이시연",
                         "이영훈", "전준석", "하진철", "황인철", "박준수" };

        String[][] group = new String[3][5];

        for (int i=0; i < group.length; i++){
            for (int j=0; j< group[i].length; ){
                int n = (int)(Math.random() * 15); // 0 ~ 14
                // (int)(Math.random() * 15) + 1 : 1부터 15까지

                if(!stu[n].equals("O")){
                    group[i][j] = stu[n];
                    stu[n] = "O";
                    j++;
                }
            }
        }

        for (int i=0; i< group.length; i++){
            System.out.println("=== " + (i+1) + "조 ===");
            for (int j=0; j<group[i].length; j++){
                System.out.print(group[i][j] + "  ");
            }
            System.out.println("\n\n");
        }


    }
}
