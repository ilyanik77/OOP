package HW2.Task1;

public class Dog extends Animal implements Eat, Move, AnimalTalk {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalTalk() {
        System.out.println("Собака " + name + " лает: Гав-Гав ");

    }

    @Override
    public void move() {
        System.out.println("Собака " + name + " гуляет ");

    }

    @Override
    public void eat() {
        System.out.println("Собака " + name + " поела ");

    }

    public void dogComeIn(String name){
        System.out.println("Собака " + name + " подошла к хозяину");

    }

}
