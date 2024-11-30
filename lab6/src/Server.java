/**
 * this is server class. It represents some server object
 */
public class Server implements NetworkElement {

    /**
     * Overriding class from {@link NetworkElement NetworkElement} interface
     * it is needed to accept visitor from {@link NetworkVisitor NetworkVisitor} interface
     * @param visitor is class that visits the class to take some information
     * @return it returns the price of the server
     */
    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this);
        System.out.println("<---Server accepts visitor--->\nServer price: "+price);
        return price;
    }

}
