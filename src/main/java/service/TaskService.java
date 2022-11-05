package service;

import model.Task;
import model.enums.Status;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    void addTask(String taskName, LocalDateTime taskStop);
    void updateStatus(long taskId, Status status);
    Optional<Task> getTaskById(long taskId);
    List<Task> getTasks();
}
