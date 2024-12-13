package Command;
import Main.*;

/**
 * command to remove {@link HttpRequest request} from the {@link HttpQueue queue}.
 * If the request is removed than it is not processed.
 */
class RemoveRequest extends HttpCommand {
    public RemoveRequest(HttpRequest request, HttpQueue queue) {
        super(request, queue);
    }

    @Override
    void execute() {
        queue.removeRequest(request);
    }
}
