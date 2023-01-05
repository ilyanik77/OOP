package HW2.Task1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Сергей", 30, "owener");
        Person person2 = new Person("Иван",32, "no owener");
        Cat cat = new Cat("Васька");
        Dog dog = new Dog("Жучка");

        person.feedCat(person.getStatus(), cat);
        System.out.print("\n");
        person.feedCat(person2.getStatus(), cat);
        System.out.print("\n");
        person.feedDog(person.getStatus(), dog);
        System.out.print("\n");
        person.feedDog(person2.getStatus(), dog);

    }
}
