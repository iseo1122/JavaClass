package Day03;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int menu = 0;

        // 학생을 정보를 담을 수 있는 배열
        Student[] students = null;

        // 학생수를 담을 변수
        int stuNum = 0;

        while (run) {
            System.out.println("====================================================");
            System.out.println("1.학생수 | 2.정보입력 | 3.정보출력 | 4.정보수정  | 5.종료");
            System.out.println("====================================================");
            System.out.print("선택 >> ");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.print("학생수 입력 >> ");
                    stuNum = sc.nextInt();
                    break;

                case 2:
                    students = new Student[stuNum];

                    for(int i=0; i<students.length; i++){
                        System.out.println((i+1) + "번 학생 정보 입력");
                        students[i] = new Student();
                        students[i].insertInfo();
                    }
                    break;

                case 3:
                    for(int i=0; i<students.length; i++){
                        System.out.println((i+1) + "번 학생 정보");
                        System.out.println(students[i]);
                    }
                    break;

                case 4:
                    System.out.print("변경할 학생 이름 입력 >> ");
                    String cName = sc.next();
                    boolean checked = true;

                    for(int i=0; i<students.length; i++){
                        if(cName.equals(students[i].name)){
                            students[i].updateInfo();
                            checked = false;

                            System.out.println("변경된 학생 정보\n " + students[i]);
                        }
                    }

                    if(checked){
                        System.out.println("해당하는 이름이 없습니다.");
                    }
                    break;

                case 5:
                    run = false;
                    System.out.println("프로그램을 종료합니다!");
                    break;

                default:
                    System.out.println("다시 입력하세요!");
                    break;

            }

        }

    }

}

