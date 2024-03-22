package Day04;

import java.util.Scanner;

public class Member {

    Scanner sc = new Scanner(System.in);

    /*
        캡슐화
        : 관련된 필드(속성)와 메소드(동작)을 하나로 묶고,
          실제 구현 내용을 외부로부터 감추는 기법(정보은닉)
        : 특정 필드나 메소드를 사용자가 조가할 수 없도록 숨겨 놓은것!

     */

    // 필드 => 접근제한자 private
    // 아이디(id), 비밀번호(pw), 이름(name), 생년월일(birth), 이메일(email), 연락처(phone)\
    private String id;      // 중복x ====> 기본키
    private String pw;      // 중복o
    private String name;    // 중복o
    private String birth;   // 중복o
    private String email;   // 중복x
    private String phone;   // 중복△
    
    // 생성자
    // 기본생성자
    public Member() {

    }

    // 매개변수 생성자
    public Member(String id, String pw, String name, String birth, String email, String phone) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.phone = phone;
    }

    // 메소드
    // toString()
    @Override
    public String toString() {
        return "Member{" + "id='" + id + '\'' + ", pw='" + pw + '\'' +
                ", name='" + name + '\'' + ", birth='" + birth + '\'' +
                ", email='" + email + '\'' + ", phone='" + phone + '\'' + '}';
    }

    // getter() : 출력, setter() : 입력
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void insertInfo() {
        // 정보 입력
        System.out.print("아이디 >> ");
        setId(sc.next());

        // 정보 수정에 있는 내용을 불러옴
        updateInfo();

//        내용이 중복되기 때문에 updateInfo()로 대체함
//        System.out.print("비밀번호 >> ");
//        pw = sc.next();
//
//        System.out.print("이름 >> ");
//        setName(sc.next());
//
//        System.out.print("생년월일 >> ");
//        setBirth(sc.next());
//
//        System.out.print("이메일 >> ");
//        setEmail(sc.next());
//
//        System.out.print("연락처 >> ");
//        setPhone(sc.next());
    }

    public void updateInfo() {
        System.out.print("비밀번호 >> ");
        setPw(sc.next());

        System.out.print("이름 >> ");
        setName(sc.next());

        System.out.print("생년월일 >> ");
        setBirth(sc.next());

        System.out.print("이메일 >> ");
        setEmail(sc.next());

        System.out.print("연락처 >> ");
        setPhone(sc.next());
    }
}
