package Main;

import TaskProccessing.Task;
import TaskProccessing.TaskCategory;

public interface Subscriber {
    void update(Task task);
    void update(Task task, TaskCategory category);
}
