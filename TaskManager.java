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
        // Validasi duplikat ID
        for (Task t : taskList) {
            if (t.getId() == task.getId()) {
                System.out.println("Task dengan ID " + task.getId() + " sudah ada!");
                return;
            }
        }
        taskList.add(task);
        System.out.println("Task berhasil ditambahkan!");
    }

    public void deleteTask(int id) {
        taskList.removeIf(t -> t.getId() == id);
        System.out.println("Task deleted (if existed).");
    }

    public void updateTask(int id, String newTitle) {
        for (Task t : taskList) {
            if (t.getId() == id) {
                t.setTitle(newTitle);
                System.out.println("Task berhasil diupdate!");
                return;
            }
        }
        System.out.println("Task tidak ditemukan.");
    }
}
