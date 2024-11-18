package Main;

import TaskProccessing.Task;
import TaskProccessing.TaskCategory;
import TaskProccessing.TaskState;

import java.util.HashSet;
import java.util.Set;

public class User implements Subscriber{
    private String name;
    private Set<TaskCategory> categorySubs = new HashSet<>();
    private Set<Task> taskSubs = new HashSet<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println(name+": new update");
        System.out.println(task.getTitle() + ": " + task.getState());
    }
    public void update(Task task, TaskCategory category){
        System.out.println(name+": new update");
        System.out.println("New task in: " + category);
        System.out.println(task.toString());
    }
}
