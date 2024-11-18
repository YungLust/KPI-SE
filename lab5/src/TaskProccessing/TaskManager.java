package TaskProccessing;

import Main.Subscriber;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class TaskManager {
    //private Set<Task> tasks = new HashSet<>();
    private HashMap<TaskCategory, Set<Subscriber>> categorySubscribers = new HashMap<>();
    private HashMap<TaskCategory, Set<Task>> taskByCategory = new HashMap<>();
    private TaskManager instance;

    private TaskManager() {
        // fill HashMaps with categories
        for (TaskCategory category : TaskCategory.values()) {
            categorySubscribers.put(category, new HashSet<>());
        }
        for (TaskCategory category : TaskCategory.values()){
            taskByCategory.put(category, new HashSet<>());
        }
    }

    //singleton
    public TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public Task createTask(String title, String description, TaskCategory category) {
        Task newTask = Task.createTask(title, description, category);
        //tasks.add(newTask);
        Set<Subscriber> categorySubs = categorySubscribers.get(category);

        //notify subscribers of the task`s category
        for(Subscriber sub : categorySubs){
            sub.update(category);
        }

        return newTask;
    }

    public void subscribe
}
