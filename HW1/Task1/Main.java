package HW1.Task1;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 51);
        Person vasya = new Person("Вася", 25);
        Person masha = new Person("Маша", 29);
        Person jane = new Person("Женя", 7);
        Person ivan = new Person("Ваня", 5);
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));

        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.parent));

        System.out.println(new Reserch(gt).ageSearch());
    }
}
