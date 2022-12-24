package HW1.Task2;



public class Main {
    public static void main(String[] args) {

        Person man = new Person("Ivan", "Yes");
        Wardrobe locker = new Wardrobe("Close");

        if (locker.getStatus() == "Open") {
            System.out.println("Шкаф уже открыт");
        } else if (man.getKey() == "Yes" && locker.getStatus() == "Close") {
            System.out.println("Ключ есть, шкаф можно открыть");
        } else if (man.getKey() == "No" && locker.getStatus() == "Close") {
            System.out.println("Ключа нет,шкаф невозможно открыть");
        }


    }
}
