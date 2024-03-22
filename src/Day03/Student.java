package Day03;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);
    
    // 필드
    String name;
    int age;
    String addr;
    String phone;

    // 생성자 : [Alt] + [Ins]
    public Student() {

    }

    public Student(String name, int age, String addr, String phone) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.phone = phone;
    }

    // 메소드
    // 클래스 정보 보기

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    // 정보입력 메소드
    public void insertInfo() {
        System.out.print("이름 입력 >> ");
        name = sc.next();

        System.out.print("나이 입력 >> ");
        age = sc.nextInt();

        sc.nextLine().trim();
        System.out.print("주소 입력 >> ");
        addr = sc.nextLine();

        System.out.print("연락처 입력 >> ");
        phone = sc.next();
    }


    public void updateInfo() {

        System.out.print("변경할 나이  >> ");
        age = sc.nextInt();

        sc.nextLine().trim();
        System.out.print("변경할 주소  >> ");
        addr = sc.nextLine();

        System.out.print("변경할 연락처  >> ");
        phone = sc.next();

    }
}
