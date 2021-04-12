package JavaInner;

/**
 * Cách này lớp inner sẽ ghi đè 1 phương thức của outer, outer nên là 1 abtracts class hoặc 1 interface
 */
abstract class Person {
    abstract void eat();
}

public class AnonymousInner {
    public static void main(String[] args) {
        Person person = new Person(){
            // Ghi đè method eat của outer Person
            void eat() {
                System.out.println("Eat rau xanh");
            }
        };

        person.eat();
    }
}
