package HW2.Task1;

public class Person {
    public String name;
    public int age;
    private String status;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void feedCat (String status, Cat cat) {
        if (status == "owener") {

            cat.catComeIn(cat.getName());
            cat.animalTalk();
            cat.eat();
        } else {

            cat.move();
        }
    }

    public void feedDog (String status, Dog dog) {
        if (status == "owener") {

            dog.dogComeIn(dog.getName());
            dog.animalTalk();
            dog.eat();
        } else {

            dog.move();
        }
    }
}
