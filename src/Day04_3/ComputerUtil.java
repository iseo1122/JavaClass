package Day04_3;

public class ComputerUtil {

    // Computer타입의 객체
    // com은 추상클래스(Computer)의 객체를 만들지 못하므로
    // Computer클래스를 상속받은 Desktop이나 Notebook의 객체를 사용한다

    public void computerMethod(Computer com){
        com.turnOn();
        com.display();
        com.typing();
        com.turnOff();
    }
}
