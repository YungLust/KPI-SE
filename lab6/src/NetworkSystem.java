import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * this class can contain different {@link NetworkElement NetworkElement} objects
 * you can delete or add new {@link NetworkElement NetworkElement} objects
 */
public class NetworkSystem implements NetworkElement{
    private Set<NetworkElement> systemElements = new HashSet<>();

    /**
     * constructor can accept any amount of the {@link NetworkElement NetworkElement} objects
     * @param elements is the objects of {@link NetworkElement NetworkElement} interface
     */
    public NetworkSystem(NetworkElement ... elements){
        systemElements.addAll(Arrays.asList(elements));
    }

    /**
     * adds element from the system
     * @param newElement is an element to add to the system
     */
    public void addElement(NetworkElement newElement){
        systemElements.add(newElement);
    }

    /**
     * deletes element from the system
     * @param element
     */
    public void removeElement(NetworkElement element){
        systemElements.remove(element);
    }

    /**
     * returns all elements of the system
     * @return
     */
    public Set<NetworkElement> getElements(){
        return systemElements;
    }

    /**
     * Overriding class from {@link NetworkElement NetworkElement} interface
     * it is needed to accept visitor from {@link NetworkVisitor NetworkVisitor} interface
     * @param visitor is class that visits the class to take some information
     * @return it returns summed price of the every system`s element
     */
    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this);
        System.out.println("<---Network system accepts visitor--->\nNetwork system price: "+price);
        return price;
    }
}
