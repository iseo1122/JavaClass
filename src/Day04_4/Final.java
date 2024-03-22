package Day04_4;

public class Final {

    /*
        this : [현재 클래스]의 필드값 , 메소드
        super : [상속받은 클래스]의 필드값, 메소드
        final : 마지막, 더 이상 수정할 수 없는
     */

    // 변수 : 변하는 수
    int num = 10;

    // 상수 : 변하지 않는 수(final추가, 이름은 대문자로)
    final int NUM = 100;

    public static void main(String[] args) {

        Final fin = new Final();

        // 변수값 변경
        fin.num = 50;
        System.out.println("num : " + fin.num);

        // 상수값 변경
        // fin.NUM = 500;
        // NUM은 final 지정했기 때문에 값을 바꿀수 없다
    }




}
