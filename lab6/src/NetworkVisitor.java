public interface NetworkVisitor {
    float visit(Server server);
    float visit(Cable cable);
    float visit(WorkStation station);
}
