package week1_Data_Strucutres_and_Algorithms.TaskManagementSystem;

class Task {

    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id, String name, String status) {
        taskId = id;
        taskName = name;
        this.status = status;
    }
}

public class TaskManagementSystem {

    static Task head = null;

    static void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newTask;
    }

    static void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                System.out.println(temp.taskId + " " + temp.taskName + " " + temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    static void traverseTasks() {

        Task temp = head;

        while (temp != null) {

            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.status);

            temp = temp.next;
        }
    }

    static void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        addTask(1, "Coding", "Pending");
        addTask(2, "Testing", "Completed");

        System.out.println("Tasks:");
        traverseTasks();

        System.out.println("\nSearch:");
        searchTask(2);

        deleteTask(1);

        System.out.println("\nAfter Delete:");
        traverseTasks();
    }
}