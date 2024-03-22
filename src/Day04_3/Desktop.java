package Day04_3;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("데스크탑 모니터를 활성화 합니다.");
    }

    @Override
    public void typing() {
        System.out.println("데스크탑 키보드로 타이핑 합니다.");
    }
}
