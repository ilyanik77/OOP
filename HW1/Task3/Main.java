package HW1.Task3;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Сергей", "owener");
        Person person2 = new Person("Иван", "no owener");
        Cat cat = new Cat("Васька");
        person.sayKisKis(person.getStatus(), cat);

        System.out.print("\n");
        person.sayKisKis(person2.getStatus(), cat);

    }
}
