package Day01;


import java.util.Scanner;

public class _10_Cafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        int price = 0;
        String menu = null;

        System.out.println("ICIA Cafe에 오신 것을 환영합니다.");
        System.out.println("주문을 도와드리겠습니다.");

        System.out.println("\n==================================");
        System.out.println("1.아메리카노\t2.바닐라라떼");
        System.out.println("3.자몽허니블랙티\t4.바닐라초코칩모카");
        System.out.println("==================================\n");
        // \t : 간격(tab)             \n : 줄바꿈

        System.out.print("메뉴를 선택하세요 >> ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                menu = "아메리카노";
                price = 2000;
                break;
            case 2:
                menu = "바닐라라떼";
                price = 3000;
                break;
            case 3:
                menu = "자몽허니블랙티";
                price = 3500;
                break;
            case 4:
                menu = "바닐라초코칩모카";
                price = 4000;
                break;
            default:
                System.out.println("해당 메뉴가 없습니다.");
                break;
        }

        if(choice>=1 && choice<=4){
            System.out.println("\n주문하신 메뉴는 " + menu);
            System.out.println("가격은 " + price + "원 입니다.");
        }

        System.out.println("이용해 주셔서 감사합니다.");

    }
}
