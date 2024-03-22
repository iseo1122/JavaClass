package Day04;

public class AccessMain {

    // 실행(main) 메소드
    public static void main(String[] args) {

        Access access = new Access();

        // 객체의 필드 값 할당
        access.public1 = 1;
        access.protected1 = 2;
        access.default1 = 3;
        // access.private1 = 4;

        System.out.println("public1 : " + access.public1);
        System.out.println("protected1 : " + access.protected1);
        System.out.println("default1 : " + access.default1);
        // System.out.println("private1 : " + access.private1);

        // 객체의 메소드 호출(실행)
        access.public2();
        access.protected2();
        access.default2();
        // access.private2();

    }


}
