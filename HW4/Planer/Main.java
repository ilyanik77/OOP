package HW4.Planer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) throws IOException {

        Task task = new Task(1, "Ivan", "Оплатить счета", 2);
        Task task1 = new Task(2, "Ivan", "Отвести детей в детсад", 1);
        Task task2 = new Task(3, "Ivan", "Купить продукты", 3);

        ArrayList<Task> planer = new ArrayList<Task>();
        planer.add(task);
        planer.add(task1);
        planer.add(task2);
        Collections.sort(planer, new TaskPriorityComparator());

        Iterator<Task> iterator = planer.iterator();
        while (iterator.hasNext()) {
            Task next = iterator.next();
            System.out.println(next);
        }

        FileWriter csvWriter = new FileWriter("HW4/Planer/planer.csv");
        csvWriter.append("id");
        csvWriter.append(",");
        csvWriter.append("ФИО");
        csvWriter.append(",");
        csvWriter.append("Описание");
        csvWriter.append(",");
        csvWriter.append("Приоритет");

        while (iterator.hasNext()) {
            csvWriter.append(iterator.next());
            csvWriter.append("\n");
            }

        csvWriter.flush();
        csvWriter.close();

    }



}
