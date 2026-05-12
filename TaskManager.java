import java.util.ArrayList;
import java.util.List;

//method to delete a task by id
public class TaskManager {
    private List<Task> taskList = new ArrayList<>();

    public void viewAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task t : taskList) {
            System.out.println(t.toString());
        }
    }

    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    public void deleteTask(int id) {
        taskList.removeIf(t -> t.getId() == id);
        System.out.println("Task deleted (if existed).");
    }
}
