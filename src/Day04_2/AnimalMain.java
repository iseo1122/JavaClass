package Day04_2;

public class AnimalMain {

    public static void main(String[] args) {

        System.out.println("=== [1] 객체생성 ===");
        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.sound();
        cat.sound();
        System.out.println();

        System.out.println("=== [2] 자동타입 변환 ===");
        Animal animal = null;

        // 업캐스팅(Upcasting)
        // 하위클래스가 상위클래스 타입으로 자동 타입 변환하는 것
        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
        System.out.println();

        System.out.println("=== [3]유틸클래스 활용 ===");
        AnimalUtil util = new AnimalUtil();
        util.animalSound(dog);
        util.animalSound(cat);
        System.out.println();

        System.out.println("=== [4]추상클래스 활용 ===");
        // Animal ani = new Animal();
        // 추상클래스는 객체를 만들 수 없다!






    }
}
