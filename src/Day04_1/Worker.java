package Day04_1;

public class Worker extends Person{

    String department;

    @Override
    void finish() {
        // super.finish();
        System.out.println("직원들은 6시에 퇴근한다.");
    }
}
