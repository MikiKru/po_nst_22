import model.Task;
import model.enums.Status;
import service.TaskService;
import service.TaskServiceImpl;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TaskService ts = new TaskServiceImpl();
        ts.addTask("new task", LocalDateTime.of(2022,12,1,10,0));
        ts.updateStatus(1, Status.DONE);
        System.out.println("Task with id = 4: " + ts.getTaskById(4));
        ts.getTasks();
    }
}
