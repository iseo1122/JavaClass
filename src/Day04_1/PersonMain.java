package Day04_1;

public class PersonMain {

    public static void main(String[] args) {

        // Info 객체 생성
        Info info = new Info();

        // Person, Student, Teacher, Worker 객체 생성

        // 부모클래스
        Person person = new Person();

        // 자식클래스
        Student student = new Student();
        Teacher teacher = new Teacher();
        Worker worker = new Worker();

        // 다형성 : 하나의 객체(info)에서
        // 여러타입(person, student, teacher, worker)을
        // 참조할 수 있는 방식을 제공해준다.

        info.finishType(person);

        info.finishType(student);
        info.finishType(teacher);
        info.finishType(worker);








    }
}
