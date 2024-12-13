package Command;
import Main.*;
/**
 * command to process {@link HttpRequest request} from the {@link HttpQueue queue}.
 */
public class ProcessRequest extends HttpCommand {

    public ProcessRequest(HttpQueue queue) {
        super(queue);
    }

    @Override
    void execute() {
        queue.processRequest();
    }
}
