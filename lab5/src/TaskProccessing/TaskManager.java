package TaskProccessing;

import Main.Subscriber;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class TaskManager {
    private Set<Task> tasks = new HashSet<>();
    private HashMap<TaskCategory, List<Subscriber>> taskByCategory = new HashMap<>();
    private TaskManager instance;

    private TaskManager() {
        // fill HashSet with all the categories
        for (TaskCategory category : TaskCategory.values()) {
            taskByCategory.put(category, new ArrayList<>());
        }
    }

    public TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void createTask(String title, String description, TaskCategory category) {
        Task newTask = Task.createTask(title, description, category);
        tasks.add(newTask);
    }
}
