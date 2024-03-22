package Day04;

public class Access {
    
    /*
        접근 제한자(Access Modifier)
        [1] public(모두에게 공개)
         : 적용대상 - 클래스, 필드, 생성자, 메소드
         : 모든 클래스에서 접근 가능
         
        [2] protected(같은 패키지, 상속 클래스)
         : 적용대상 - 필드, 생성자, 메소드
         : 자식클래스가 아닌 다른 패키지에 소속된 클래스는 접근 불가능
         
        [3] default(같은 패키지) - 생략
         : 적용대상 - 클래스, 필드, 생성자, 메소드
         : 다른 패키지에 소속된 클래스는 접근 불가능
         
        [4] private(현재 클래스)
         : 적용대상 - 필드, 생성자, 메소드
         : 자신이 아닌 다른 클래스에서 접근 불가능
    
     */
    
    // 클래스 3요소
    
    // 필드
    public      int public1;
    protected int protected1;
    int default1;
    private     int private1;
    
    // 생성자
    public Access() {

    }

    // 메소드
    public void public2(){
        System.out.println("접근제한자 public 메소드");
    }

    protected void protected2(){
        System.out.println("접근제한자 protected 메소드");
    }

    void default2(){
        System.out.println("접근제한자 default 메소드");
    }

    private void private2(){
        System.out.println("접근제한자 private 메소드");
    }


    // 실행(main) 메소드
    public static void main(String[] args) {

        Access access = new Access();

        // 객체의 필드 값 할당
        access.public1 = 1;
        access.protected1 = 2;
        access.default1 = 3;
        access.private1 = 4;

        System.out.println("public1 : " + access.public1);
        System.out.println("protected1 : " + access.protected1);
        System.out.println("default1 : " + access.default1);
        System.out.println("private1 : " + access.private1);

        // 객체의 메소드 호출(실행)
        access.public2();
        access.protected2();
        access.default2();
        access.private2();

    }
    

}
