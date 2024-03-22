package Day04_3;

public class Notebook extends Computer{
    @Override
    public void display() {
        System.out.println("노트북 모니터를 활성화 합니다.");
    }

    @Override
    public void typing() {
        System.out.println("노트북 키보드로 타이핑 합니다.");
    }
}

/*
    ComputerMain 클래스를 만들어서 다형성 3가지 방법으로 
    Desktop과 Notebook의 display(), typing() 메소드를 실행
 */






