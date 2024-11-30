/**
 * this interface for objects that can be visited by {@link NetworkVisitor NetworkVisitor} object
 * It has {@link #accept accept() }method to correctly accept the visitor.
 */
public interface NetworkElement {
    float accept(NetworkVisitor visitor);
}
