package HW1.Task3;

public class Person {
    private String name;
    private String status;

    public Person(String name, String status) {
        this.name = name;
        this.status = status;

    }

    public void sayKisKis(String status, Cat cat) {
        if (status == "owener") {

            cat.catComeIn(cat.getName());
        } else {

            cat.catComeOut(cat.getName());
        }
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
}
