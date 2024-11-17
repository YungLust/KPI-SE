package Main;

import TaskProccessing.Task;
import TaskProccessing.TaskCategory;

import java.util.HashSet;
import java.util.Set;

public class User implements Subscriber{
    private String name;
    private Set<TaskCategory> categorySubs = new HashSet<>();
    private Set<Task> taskSubs = new HashSet<>();


    @Override
    public void update(Task task) {
        System.out.println(name+": ");
        System.out.println(task.getTitle() + ": " + task.getState());
    }
}
