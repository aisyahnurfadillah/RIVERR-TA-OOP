  import java.util.ArrayList;
  import java.util.List;

  public class TaskManager{
      // Data Structure to hold the objects
      private List<Task> taskList = new ArrayList<>();
  }

  public void addTask(Task task){
    taskList.add(task);
    System.out.println("Task added successfully!");
  }
    
  public void viewAllTasks(){
    if (taskList.isEmpty()) {
        System.out.println("No tasks available.");
        return;
    }
    for (Task t : taskList) {
        System.out.println(t.toString());
    }
}

    public void updateTask(int id, String newTitle){
      for (Task t : taskList) {
        if (t.getId() == id) {
          t.setTitle(newTitle);
          System.out.println("Task updated!");
          return;
        }
     }
     System.out.println("Task not found.");
    }

    public void deleteTask(int id){
          taskList.removeIf(t -> t.getId() == id);
          System.out.println("Task deleted (if existed).");
    }