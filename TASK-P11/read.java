      public void viewAllTasks(){
          if (taskList.isEmpty()) {
              System.out.println("No tasks available.");
              return;
          }
          for (Task t : taskList) {
              System.out.println(t.toString());
          }
      }