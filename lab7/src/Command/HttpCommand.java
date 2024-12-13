package Command;

import Main.HttpQueue;
import Main.HttpRequest;

/**
 * abstract class that represents a command to operate {@link HttpQueue queue}
 * Subclasses should implement the {@code execute()} method to define specific command behaviors.
 */
public abstract class HttpCommand {
    protected HttpRequest request;
    protected HttpQueue queue;

    /**
     * constructs class with the specified request and queue
     * @param request request the {@link HttpRequest} to operate on.
     * @param queue queue the {@link HttpQueue} the command interacts with.
     */
    public HttpCommand(HttpRequest request, HttpQueue queue){
        this.request = request;
        this.queue = queue;
    }

    /**
     * constructs class without specific request.
     * It can be used to perform general commands in queue
     * @param queue the {@link HttpQueue} the command interacts with.
     */
    public HttpCommand(HttpQueue queue){
        this.queue = queue;
        request = null;
    }

    /**
     * abstract empty method to execute command.
     * Child classes must override this. So {@link Invoker invoker} can execute commands
     */
    void execute(){

    }

    /**
     * this is method declared in abstract class
     * if it perhaps needed in child classes
     * is used to change {@link HttpRequest request}
     * @param request the new request to replace the current one
     */
    public void changeRequest(HttpRequest request) {
        this.request = request;
    }


    /**
     * this is method declared in abstract class
     * if it perhaps needed in child classes
     * is used to change {@link HttpQueue queue}
     * @param queue the new queue to replace the current one
     */
    public void changeQueue(HttpQueue queue) {
        this.queue = queue;
    }
}


