package HW1.Task2;

public class Person {
    private String name;
    private String key;

    public Person(String name, String key) {
        this.name = name;
        this.key = key;

    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey (String key) {
        this.key = key;
    }
}
