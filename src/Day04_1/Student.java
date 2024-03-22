package Day04_1;

public class Student extends Person{

    // String name;
    // int age;
    // String phone;
    String classroom;
    int grade;

    @Override
    void finish() {
        // super.finish();
        System.out.println("교육생은 4시50분에 퇴실한다.");
    }
}
