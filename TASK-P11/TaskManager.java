import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList = new ArrayList<>();

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

    public void viewAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Tidak ada task.");
            return;
        }
        for (Task t : taskList) {
            System.out.println(t);
        }
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

    public void deleteTask(int id) {
        boolean removed = taskList.removeIf(t -> t.getId() == id);
        System.out.println(removed ? "Task berhasil dihapus." : "Task tidak ditemukan.");
    }

    // Main method agar bisa dijalankan
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Belajar Java"));
        manager.addTask(new Task(2, "Mengerjakan PR"));
        manager.viewAllTasks();

        manager.updateTask(1, "Belajar Java OOP");
        manager.deleteTask(2);
        manager.viewAllTasks();
    }
}