package task.example.demo.repository;

import task.example.demo.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> findAll() {
        return tasks;
    }

    public Task save(Task task) {
        tasks.add(task);
        return task;
    }

    public Optional<Task> findById(Long id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst();
    }

    public void delete(Task task) {
        tasks.remove(task);
    }
}
