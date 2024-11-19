package Main;

import TaskProccessing.Task;
import TaskProccessing.TaskCategory;

import java.util.HashSet;
import java.util.Set;


/**
 * this is class for users, they can subscribe to {@link Task tasks} and {@link TaskCategory categories}
 * that`s why this class implements {@link Subscriber Subscriber}
 */
public class User implements Subscriber{
    private String name;
    private Set<TaskCategory> categorySubs = new HashSet<>();
    private Set<Task> taskSubs = new HashSet<>();

    public User(String name) {
        this.name = name;
    }

    /**
     * it updates information about {@link Task task} for user
     * @param task is a {@link Task task}  where update happened
     */
    @Override
    public void update(Task task) {
        System.out.println(name+": new update");
        System.out.println(task.getTitle() + ": " + task.getState());
    }

    /**
     * it updates information for user.
     * It prints the new tasks in subscribed category
     * @param task is task a new {@link Task task}  in {@link TaskCategory category}
     * @param category is a {@link TaskCategory category} where update happened
     */
    @Override
    public void update(Task task, TaskCategory category){
        System.out.println(name+": new update");
        System.out.println("New task in: " + category);
        System.out.println(task.toString());
    }
}
