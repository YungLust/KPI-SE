package Main;

import TaskProccessing.Task;
import TaskProccessing.TaskCategory;
import TaskProccessing.TaskManager;
import TaskProccessing.TaskState;

public class Main {
    public static void main(String[] args){
        TaskManager manager = TaskManager.getInstance();

        Task BugTask = manager.createTask("Fix bug", "Fix bug #145 in Main.java", TaskCategory.FIXING);

        manager.createTask("Make another login variant", "Make login variant via Telegram", TaskCategory.BACKEND);

        Task frontTask1 = manager.createTask("Change color button", "Make purhcase button blue in index.html", TaskCategory.FRONTEND);
        Task frontTask2 = manager.createTask("Recolor hero-section", "Change gradient in hero-section in index.html", TaskCategory.FRONTEND);
        User artur = new User("Artur");
        User ilya = new User("Ilya");
        User roma = new User("Roma");

        BugTask.subscribe(artur);
        BugTask.changeState(TaskState.TESTING);
        System.out.println();
        BugTask.subscribe(ilya);
        BugTask.changeState(TaskState.COMPLETED);
        System.out.println();
        manager.subscribe(TaskCategory.FRONTEND, roma);
        Task frontTask3 = manager.createTask("Make button bigger", "Make confirm button bigger in checkout.html", TaskCategory.FRONTEND);
        System.out.println();
        frontTask1.changeState(TaskState.COMPLETED);
        frontTask2.changeState(TaskState.IN_PROGRESS);

    }
}
