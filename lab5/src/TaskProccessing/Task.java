package TaskProccessing;

import Main.*;
import java.util.HashSet;
import java.util.Set;

/**
 * this class is used for tasks.
 *
 */
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

    /**
     * default constructor, takes arguments to create task and sets state to the default one
     * @param title is a task`s title
     * @param description is a task`s description
     * @param category is a task`s category from enum {@link TaskCategory TaskCategory}
     */
    private Task(String title, String description, TaskCategory category) {
        this.title = title;
        this.description = description;
        this.category = category;
        state = TaskState.AVAILABLE; // default state is AVAILABLE
    }

    /**
     * Factory method to create a new {@link Task Task}
     * we use default access-modifier to ensure so
     * Task is created only inside the package {@link TaskProccessing TaskProccessing}
     */
    static Task createTask (String title, String description, TaskCategory category){
        return new Task(title, description, category);
    }

    /**
     * method to subscribe user to task
     * @param sub is a user to subscribe
     */
    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    /**
     * method to unsubscribe user to task
     * @param sub is a user to unsubscribe
     */
    public void unsubscribe(Subscriber sub){
        subscribers.remove(sub);
    }

    /**
     * Method to notify all the subscribers of task
     */
    private void notifySubscribers(){
        for (Subscriber subscriber : subscribers){
            subscriber.update(this);
        }
    }

    /**
     * This method to change state of a task. If new state is the same nothing happens
     * @param state is a new state from {@link TaskState TaskState}
     */
    public void changeState(TaskState state) {
        if (this.state != state){
            this.state = state;
            notifySubscribers();
        }
        else {
            System.out.println("Already " + state.toString());
        }
    }

    /**
     * Overriding default object method to return some information about task
     * @return it returns title and description of the task
     */
    @Override
    public String toString(){
        return title+": "+description;
    }

    /**
     * getter for title
     * @return task title
     */
    public String getTitle() {
        return title;
    }

    /**
     * getter for state
     * @return task state
     */
    public TaskState getState() {
        return state;
    }
}
