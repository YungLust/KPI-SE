package Command;

/**
 * The Commands.Invoker class in Command design pattern
 * It saves some command and executes a command object
 */
public class Invoker {
    private HttpCommand command;

    /**
     * Constructs an Commands.Invoker with the specified {@link HttpCommand command}.
     *
     * @param command the initial {@link HttpCommand command} to be executed by this invoker
     */
    public Invoker(HttpCommand command) {
        this.command = command;
    }

    /**
     * Updates the current command with a new one.
     * It is needed when the invoker needs to perform
     * a different request or operation.
     * @param command the new command to be executed
     */
    public void setCommand(HttpCommand command) {
        this.command = command;
    }

    /**
     * Executes the command.
     *
     * This method delegates the execution responsibility to the command object
     */
    public void execute(){
        command.execute();
    }
}
