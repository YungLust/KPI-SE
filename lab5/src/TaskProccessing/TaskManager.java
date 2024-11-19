package TaskProccessing;

import Main.Subscriber;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/**
 * This class manages {@link Task Task} class.
 * You can only create {@link Task Task} in this class
 * The class is singleton
 */
public class TaskManager {
    //private Set<Task> tasks = new HashSet<>();

    /**
     * HashMap contains {@link TaskCategory category} as a key and all of its {@link Subscriber subscribers} in set as a value
     */
    private HashMap<TaskCategory, Set<Subscriber>> categorySubscribers = new HashMap<>();

    /**
     * HashMap contains {@link TaskCategory category} as a key and all of the categories` {@link Task tasks} in set as a value
     */
    private HashMap<TaskCategory, Set<Task>> taskByCategory = new HashMap<>();
    /**
     * this is instance for singleton pattern. It is created only once
     */
    private static TaskManager instance;

    /**
     * constructor that fills all the HashMaps with categories and empty sets.
     * This ensures that no mistakes occur when trying to add {@link Subscriber subs} or {@link Task tasks} to the HashMap
     * The constructor is private because it is used in method {@link #getInstance getInstance}. So not more than 1 instance of the class created
     */
    private TaskManager() {
        // fill HashMaps with categories
        for (TaskCategory category : TaskCategory.values()) {
            categorySubscribers.put(category, new HashSet<>());
        }
        for (TaskCategory category : TaskCategory.values()){
            taskByCategory.put(category, new HashSet<>());
        }
    }

    /**
     * This method that uses private constructor if no instance already exists
     * @return it returns instance of the class
     */
    public static TaskManager getInstance() {
        if (TaskManager.instance == null) {
            TaskManager.instance = new TaskManager();
        }
        return TaskManager.instance;
    }

    /**
     * Method to create {@link Task tasks}
     * According to the task`s {@link TaskCategory category}
     * subscribers notified and task added to {@link @taskByCategoey HashMap}
     * @param title is {@link Task tasks`} title
     * @param description is {@link Task tasks`} description
     * @param category is {@link Task tasks`} {@link TaskCategory category}
     * @return it returns new instance of {@link Task task}
     */
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

    /**
     * method to subscribe user to some category
     * It subscribes to all the category`s tasks
     * If user subscribed to some category it will get
     * updated if new task of the category is created
     * @param category is a category to unsubscribe from
     * @param sub is a user to subscribe to category
     */
    public void subscribe(TaskCategory category, Subscriber sub){
        categorySubscribers.get(category).add(sub);

        //subscribe to all tasks of category
        Set<Task> categoryTasks = taskByCategory.get(category);
        for (Task task : categoryTasks){
            task.subscribe(sub);
        }
    }

    /**
     * method to unsubscribe user to category
     * It unsubscribes from all the category`s tasks
     * @param category is a category to unsubscribe from
     * @param sub is a user to unsubscribe
     */
    public void unsubscribe(TaskCategory category, Subscriber sub){
        categorySubscribers.get(category).remove(sub);
        Set<Task> categoryTasks = taskByCategory.get(category);
        for (Task task : categoryTasks){
            task.unsubscribe(sub);
        }
    }

}
