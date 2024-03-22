/**
 * Date : 2024.02.28
 * Author : inchoriya
 * Description : 자바의 특징
 * Version : 1.0
 */
package Day03;

public class _05_OOP {

    /*
     [1] 자바는 객체 지향 프로그래밍이다.
	 - OOP(Object - Oriented - Programming)
	 - 프로그래밍 하기 위해서 단위(객체)로 잘게 나눠서 코딩
	 - 다시 이것들 조립해서 복잡한 프로그램을 만드는 것

	 (1)절차지향 : 순서대로 진행되는 프로그램
	 	ex) 급식소에서 줄을 서서 밥을 먹는 것
	 	ex) 맞춤옷 : 원하는 형태로 만들어서 입는 것

    (2)객체지향 : 객체(클래스)라는 작은 단위로 프로그래밍 하는 것
		ex) 부페에서 내가 원하는 음식을 가져와서 먹는 것
		ex) 기성옷 : 내몸에 맞는 것을 골라 입는 것
		단점 : 불필요한 메모리가 생길수 있음

     [2] 객체 모델링(Object Modeling)
	 - 현실 세계의 객체를 소프트웨어 객체로 설계하는 것

	 [3] 클래스와 객체
	 (1) 클래스(설계도) : 샌드위치 레시피, 스마트폰 설계도

	 (2) 객체(실제로 존재하는 물건이나 개념) : 샌드위치, 스마트폰
		- 다른 것과 식별이 가능한 것
		- 자신만의 고유한 특성과 행동을 가지며, 다른 객체들과 상호작용 한다.
		- 클래스에서 인스턴스(instance)라고 부른다.

     [4] 객체의 특성 3가지
	  (1) 캡슐화(Encapsulation) : 정보은닉
	  (2) 상속(Inheritance) : 부모-자식
	  (3) 다형성(Polymorphism) : 상속에서 사용, 같은 코드 - 다른 출력

     [5] Class 구조
     
     (접근제한자) class 클래스이름 {
        클래스의 기본 구성
        (1) 필드
        (2) 생성자
        (3) 메소드
        (모두 생략 가능)
     }

     */

    // 메인 함수(메소드)
    public static void main(String[] args) {
        // public : 접근제한자(public : 모두에게 공개)
        // static : 정적(객체를 생성하지 않고 사용가능)
        // void : 메소드의 데이터타입(return값 가지지 않는다.)
        // main : 메소드 이름
        // (String[] args) : 매개변수 => ( ) 괄호 안에 있는 내용을 메소드에서 사용한다.
    }

    // 기본 생성자
    public _05_OOP(){

    }

    // 매개변수 생성자 : 필드값을 매개변수로 갖는다.
    public _05_OOP(int a){

    }

    // 메소드
    public String getName(){
        return "이름";
    }

    public int getAge(){
        return 30;
    }

    /*
        [1] 필드(Filed) : 속성, 상태, 특성
         - 명사형
         - '맴버변수' 라고 부르기도 한다.
         - 값의 상태를 관리
         - 데이터를 저장하는 공간
         ex) int num;

        [2] 생성자(Constructor)
         - 객체를 만들때 따라하야 하는 규칙 정의
         - 객체 생성을 도와주는 블록
         - 생성자 이름은 클래스 이름과 동일해야 한다.

        [3] 메소드(Method)
         - 동사형
         - 특정한 기능을 정의한 블록
         - 메소드가 호출되면 자신이 가지고 있는 기능을 수행
         - 기능 수행이 끝나고 리턴값을 처리

     */



}