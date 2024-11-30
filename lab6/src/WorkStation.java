/**
 * this is work station class. It represents some work station
 */
public class WorkStation implements NetworkElement {

    /**
     * Overriding class from {@link NetworkElement NetworkElement} interface
     * it is needed to accept visitor from {@link NetworkVisitor NetworkVisitor} interface
     * @param visitor is class that visits the class to take some information
     * @return it returns the price of the work station
     */
    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this);
        System.out.println("<---Work station accepts visitor--->\nWork station price: "+price);
        return visitor.visit(this);
    }
}
