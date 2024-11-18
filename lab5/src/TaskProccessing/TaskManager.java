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
    private static TaskManager instance;

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
    public static TaskManager getInstance() {
        if (TaskManager.instance == null) {
            TaskManager.instance = new TaskManager();
        }
        return TaskManager.instance;
    }

    public Task createTask(String title, String description, TaskCategory category) {
        //create new task
        Task newTask = Task.createTask(title, description, category);

        //get new task`s category subscribers
        Set<Subscriber> categorySubs = categorySubscribers.get(category);

        //notify subscribers of the task`s category
        for(Subscriber sub : categorySubs){
            sub.update(newTask, category);
        }

        //add task to the HashMap according to the category
        Set<Task> categoryTasks = taskByCategory.get(category);
        categoryTasks.add(newTask);


        return newTask;
    }

    public void subscribe(TaskCategory category, Subscriber sub){
        //add new sub to category
        Set<Subscriber> categorySubs = categorySubscribers.get(category);
        categorySubs.add(sub);

        //subscribe to all tasks of category
        Set<Task> categoryTasks = taskByCategory.get(category);
        for (Task task : categoryTasks){
            task.subscribe(sub);
        }
    }

    public void subscribe(Task task, Subscriber sub){
        task.subscribe(sub);
    }
}
