/**
 * this is cable class. It has its length that affects price.
 */
public class Cable implements NetworkElement{
    /**
     * length variable it is needed to calculate price
     */
    private float length;

    /**
     * default constructor with length of the cable
     * @param length is cable`s length
     */
    public Cable(double length){
        this.length = (float) length;
    }

    /**
     * Overriding class from {@link NetworkElement NetworkElement} interface
     * it is needed to accept visitor from {@link NetworkVisitor NetworkVisitor} interface
     * @param visitor is class that visits the class to take some information
     * @return it returns the price of the cable
     */
    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this) * length;
        System.out.println("<---Cable accepts visitor--->\nCable price (according to length): "+price);
        return price;
    }
}
