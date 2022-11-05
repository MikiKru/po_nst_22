package service;

import model.Task;
import model.enums.Status;

import java.time.LocalDateTime;


public interface TaskService {
    void addTask(String taskName, LocalDateTime taskStop);
    void updateStatus(long taskId, Status status);
    Task getTaskById(long taskId);
    void getTasks();
}
