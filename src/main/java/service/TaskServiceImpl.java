package service;

import model.Task;
import model.enums.Status;
import repository.TaskRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService{
    private static int counter = 3;
    @Override
    public void addTask(String taskName, LocalDateTime taskStop) {
        TaskRepository.tasks.add(new Task(++counter, taskName, LocalDateTime.now(), taskStop, Status.NEW));
    }
    @Override
    public void updateStatus(long taskId, Status status) {
        if(getTaskById(taskId) != null){
            Task task = getTaskById(taskId);
            task.setStatus(status);
        }
    }
    @Override
    public Task getTaskById(long taskId) {
        for (Task task : TaskRepository.tasks) {
            if(task.getTaskId() == taskId){
               return task;
            }
        }
        return null;
    }
    @Override
    public void getTasks() {
        for (Task task : TaskRepository.tasks){
            System.out.println(task);
        }
    }
}
