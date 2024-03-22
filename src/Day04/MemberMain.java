package Day04;

import java.util.Arrays;
import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int menu = 0;

        // 한 사람의 정보를 담기 위한 Member객체
        Member member;

        // 회원들의 정보를 담기 위한 Member배열
        Member[] members = new Member[0];

        while(run){
            System.out.println("======================================================");
            System.out.println(" 1.정보입력 | 2.정보출력 | 3.정보수정 | 4.정보삭제 | 5.종료");
            System.out.println("======================================================");
            System.out.print("선택 >> ");
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    // 한 사람의 정보를 입력받기 위한 member객체
                    // 초기화 하기 위해 new Member() 생성자
                    member = new Member();

                    // 기존에 있던 members배열을 복사하고 배열의 크기를 1증가 시킨다
                    members = Arrays.copyOf(members, members.length+1);

                    // 정보 입력 메소드
                    // insertInfo()
                    member.insertInfo();

                    members[members.length-1] = member;
                    break;

                case 2:
                    for (int i=0; i<members.length; i++){
                        System.out.println(members[i]);
                    }
                    break;

                case 3:
                    System.out.print("수정할 아이디 >> ");
                    String cId = sc.next();

                    // 아이디 존재여부를 확인하기 위한 checked 변수
                    boolean checked = true;

                    // 회원수만큼 반복문 실행
                    for(int i=0; i<members.length; i++){

                        if(cId.equals(members[i].getId())){
                            // 수정
                            // updateInfo()
                            members[i].updateInfo();
                            checked = false;
                        }
                    }

                    if(checked){
                        System.out.println("해당 아이디가 존재하지 않습니다.");
                    }
                    break;

                case 4:
                    System.out.print("삭제할 아이디 >> ");
                    cId = sc.next();

                    // 아이디 존재여부 확인
                    boolean checked2 = true;
                    for (int i=0; i<members.length; i++){
                        if(cId.equals(members[i].getId())){
                            checked2 = false;
                        }
                    }

                    if (checked2){
                        System.out.println("입력한 아이디가 존재하지 않습니다.");
                    } else {
                        Member[] newMembers = new Member[members.length-1];

                        for (int i=0, k=0; i< members.length; i++){
                            if(cId.equals(members[i].getId())){
                                continue;
                            }

                            newMembers[k++] = members[i];
                        }

                        // members의 크기 재정의(원래 배열에서 1만큼 줄여준다)
                        members = new Member[newMembers.length];

                        // members 배열에 newMembers 내용을 복사한다.
                        members = Arrays.copyOf(newMembers, newMembers.length);
                    }

                    break;

                case 5:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }


        }




    }
}
