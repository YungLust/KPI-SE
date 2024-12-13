
package Main;

import TaskProccessing.Task;
import TaskProccessing.TaskCategory;
import TaskProccessing.TaskManager;
import TaskProccessing.TaskState;

/**
 * In main class the logic of the program tested
 * Some users and tasks created.
 */
public class Main {
    public static void main(String[] args){
        TaskManager manager = TaskManager.getInstance();

        Task BugTask = manager.createTask("Fix bug", "Fix bug #145 in Main.Main.java", TaskCategory.FIXING);

        manager.createTask("Make another login variant", "Make login variant via Telegram", TaskCategory.BACKEND);

        Task frontTask1 = manager.createTask("Change color button", "Make purchase button blue in index.html", TaskCategory.FRONTEND);
        Task frontTask2 = manager.createTask("Recolor hero-section", "Change gradient in hero-section in index.html", TaskCategory.FRONTEND);
        User artur = new User("Artur");
        User ilya = new User("Ilya");
        User roma = new User("Roma");

        System.out.println("\nSubscribing Artur to Fix bug\n*");
        BugTask.subscribe(artur);
        BugTask.changeState(TaskState.TESTING);
        System.out.println("\nSubscribing Ilya to Fix bug\n*");
        BugTask.subscribe(ilya);
        BugTask.changeState(TaskState.COMPLETED);
        System.out.println();
        manager.subscribe(TaskCategory.FRONTEND, roma);
        System.out.println("Subscribing Roma to frontEnd\n*");
        frontTask1.changeState(TaskState.COMPLETED);
        frontTask2.changeState(TaskState.IN_PROGRESS);
        Task frontTask3 = manager.createTask("Make button bigger", "Make confirm button bigger in checkout.html", TaskCategory.FRONTEND);
        System.out.println("\nSubscribing Ilya to FrontEnd\nUnsubscribing Roma from FrontEnd\n*");
        manager.subscribe(TaskCategory.FRONTEND,ilya);
        manager.unsubscribe(TaskCategory.FRONTEND,roma);
        frontTask2.changeState(TaskState.TESTING);
        Task frontTask4 = manager.createTask("Make button bigger", "Make confirm button bigger in checkout.html", TaskCategory.FRONTEND);


    }
}
