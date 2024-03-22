package Day04_3;

public class ComputerMain {

    public static void main(String[] args) {
        System.out.println("=== [1] 객체생성 ===");
        Desktop top = new Desktop();
        Notebook note = new Notebook();

        top.turnOn();
        top.display();
        top.typing();
        top.turnOff();

        note.turnOn();
        note.display();
        note.typing();
        note.turnOff();

        System.out.println();

        System.out.println("=== [2] 자동타입 변환 ===");
        Computer com = null;
        com = new Desktop();
        com.turnOn();
        com.display();
        com.typing();
        com.turnOff();

        com = new Notebook();
        com.turnOn();
        com.display();
        com.typing();
        com.turnOff();

        System.out.println();

        System.out.println("=== [3]유틸클래스 활용 ===");
        ComputerUtil util = new ComputerUtil();
        util.computerMethod(top);
        util.computerMethod(note);

    }
}
