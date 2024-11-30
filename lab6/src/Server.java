public class Server implements NetworkElement {

    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this);
        System.out.println("Server accepts visitor:\nServer price: "+price);
        return price;
    }

}
