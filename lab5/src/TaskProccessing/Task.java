package TaskProccessing;

import Main.*;
import java.util.HashSet;
import java.util.Set;

public class Task {

    /*
     * we declare Set immediately so we can use it right away
     * without adding any subscribers to it beforehand
     * we use Set instead of List to avoid duplicates
     */
    private Set<Subscriber> subscribers = new HashSet<>();

    private String title;
    private String description;
    private TaskCategory category;
    private TaskState state;


    private Task(String title, String description, TaskCategory category) {
        this.title = title;
        this.description = description;
        this.category = category;
        state = TaskState.AVAILABLE; // default state is AVAILABLE
    }

    /*
     * Factory method to create a new Task
     * we use default access-modifier to ensure so
     * Task is created only inside the package
     */
    static Task createTask (String title, String description, TaskCategory category){
        return new Task(title, description, category);
    }

    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    private void notifySubscribers(){
        for (Subscriber subscriber : subscribers){
            subscriber.update(this);
        }
    }

    public void changeState(TaskState state) {
        if (this.state != state){
            this.state = state;
            notifySubscribers();
        }
        else {
            System.out.println("Already " + state.toString());
        }
    }

    @Override
    public String toString(){
        return title+": "+description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public TaskState getState() {
        return state;
    }
}
