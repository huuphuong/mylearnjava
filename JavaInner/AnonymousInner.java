package JavaInner;

abstract class Person {
    abstract void eat();
}

public class AnonymousInner {
    public static void main(String[] args) {
        Person person = new Person(){
            void eat() {
                System.out.println("Eat rau xanh");
            }
        };

        person.eat();
    }
}
