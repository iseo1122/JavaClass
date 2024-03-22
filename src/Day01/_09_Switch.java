package Day01;

import java.util.Scanner;

public class _09_Switch {
    public static void main(String[] args) {
        /*

		 switch(조건변수){

		 case 변수값1 :
		 	조건변수가 변수값1 일때 실행;
		 	break;

		 case 변수값2 :
		 	조건변수가 변수값2 일때 실행;
		 	break;

		 case 변수값n :
		 	조건변수가 변수값n 일때 실행;
		 	break;

		 default :
		 	case에서 어떤 조건도 맞지 않을 경우 실행;
		 	break;
		 }

		 */

        // 31일 : 1, 3, 5, 7, 8, 10, 12
        // 30일 : 4, 6, 9, 11
        // 28일 : 2

        Scanner sc = new Scanner(System.in);

        System.out.print("해당 월을 입력하세요 >> ");
        int month = sc.nextInt();
        int day = 0;

//        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
//            day = 31;
//        } else if (month==4 || month==6 || month==9 || month==11){
//            day = 30;
//        } else if(month==2){
//            day = 28;
//        } else {
//            System.out.println("범위초과!");
//        }

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                System.out.println("범위초과!");
                break;
        }

        if(month >= 1 && month <= 12){
            System.out.println(month + "월은 " + day + "일 까지 있습니다.");
        }






    }
}
