
/**
 * Visitor interface. It declares method for every
 * {@link NetworkElement NetworkElement} object
 * so they can be visited.
 */
public interface NetworkVisitor {
    float visit(Server server);
    float visit(Cable cable);
    float visit(WorkStation station);
    float visit(NetworkSystem system);
}
