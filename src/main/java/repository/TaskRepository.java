package repository;

import model.Task;
import model.enums.Status;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public interface TaskRepository {
    List<Task> tasks = new LinkedList<>(
            Arrays.asList(
                    new Task(1, "Learning of Java OOP", LocalDateTime.now(), LocalDateTime.of(2023,2,2,10,0), Status.IN_PROGRESS),
                    new Task(2, "Learning of MySQL databases", LocalDateTime.now(), LocalDateTime.of(2023,3,1,10,0), Status.NEW),
                    new Task(3, "Learning of design patterns", LocalDateTime.now(), LocalDateTime.of(2023,1,5,10,0), Status.DONE)

            )
    );
}
