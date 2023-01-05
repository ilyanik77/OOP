package HW2.Task1;

public class Cat extends Animal implements Eat, Move, AnimalTalk {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void animalTalk() {
        System.out.println("Кошка " + name + " мяукает: Мяу ");

    }

    @Override
    public void move() {
        System.out.println("Кошка " + name + " гуляет ");

    }

    @Override
    public void eat() {
        System.out.println("Кошка " + name + " поела ");

    }

}
