package HW4.Planer;

//import java.util.List;
//import java.util.Scanner;

public class Task implements Comparable<Task>{
    public int id;
    public String fullName;
    public String task;
    public int priority;


    public Task(int id, String fullName, String task, int priority) {
        this.id = id;
        this.fullName = fullName;
        this.task = task;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String toString() {
        return "[id=" + id + ", fullName=" + fullName + ", task=" + task + ", priority=" + priority + "]";
    }

    @Override
    public int compareTo(Task o) {

        return 0;
    }


}
