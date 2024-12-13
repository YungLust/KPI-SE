package Command;
import Main.*;
/**
 * command to change {@link HttpRequest request} priority in some {@link HttpQueue queue}.
 * If the priority changed then the order of queue is changed too
 */
public class ChangeRequestPriority extends HttpCommand {
    private int priority;

    /**
     * constructor same as the parent class but
     * also has an additional parameter - priority
     *
     * @param request  is request whose priority to change
     * @param queue    is queue where this request placed
     * @param priority is new priority of the request
     * @see {@link HttpQueue#changeRequestPriority Main.HttpQueue.changeRequestPriority()}
     */
    public ChangeRequestPriority(HttpRequest request, HttpQueue queue, int priority) {
        super(request, queue);
        this.priority = priority;
    }

    /**
     * you can actually set another priority
     * and then execute one more time in {@link Invoker invoker} class
     *
     * @param priority is the new priority to apply to request
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    void execute() {
        queue.changeRequestPriority(request, priority);
    }
}
