package Day04_1;

public class Teacher extends Person {

    String subject;
    int salary;

    @Override
    void finish() {
        // super.finish();
        System.out.println("선생님은 5시에 퇴근한다.");
    }
}
