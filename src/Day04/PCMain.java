package Day04;

public class PCMain {

    public static void main(String[] args) {

        // 부모클래스 객체 생성
        Parent parent = new Parent();

        // 부모클래스의 필드, 메소드 확인
        System.out.println("부모클래스 필드 : " + parent.parentVar);
        parent.parentMethod(1, 2);
        System.out.println();

        // 자식클래스 객체 생성
        Child child = new Child();

        // 자식클래스의 필드, 메소드 확인
        System.out.println("자식클래스 필드 : " + child.childVar);
        child.childMethod();
        System.out.println();

        // 부모클래스로 부터 상속받은 필드, 메소드 확인
        System.out.println("상속 필드 : " + child.parentVar);
        child.parentMethod(2, 3);
        System.out.println();








    }



}
