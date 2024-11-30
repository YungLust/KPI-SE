public class WorkStation implements NetworkElement {

    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this);
        System.out.println("Work station accepts visitor:\nWork station price: "+price);
        return visitor.visit(this);
    }
}
