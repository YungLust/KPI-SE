package Main;

import TaskProccessing.Task;
import TaskProccessing.TaskCategory;

/**
 * interface has overloading method update.
 * Update for {@link TaskCategory category} which takes task and category as parameters
 * Update for {@link Task task} which takes task as a parameter
 */
public interface Subscriber {
    void update(Task task);
    void update(Task task, TaskCategory category);
}
