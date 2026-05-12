import java.util.ArrayList;
import java.util.List;

//method to delete a task by id
public class TaskManager{
    private List<Task> taskList = new ArrayList<>();

    public void deleteTask(int id){
        taskList.removeIf(t -> t.getId() == id);
        System.out.println("Task deleted (if existed).");
    }
}

