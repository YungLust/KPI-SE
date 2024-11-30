import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NetworkSystem implements NetworkElement{
    private Set<NetworkElement> systemElements = new HashSet<>();

    public NetworkSystem(NetworkElement ... elements){
        systemElements.addAll(Arrays.asList(elements));
    }

    public void addElement(NetworkElement newElement){
        systemElements.add(newElement);
    }

    public void removeElement(NetworkElement element){
        systemElements.remove(element);
    }

    public Set<NetworkElement> getElements(){
        return systemElements;
    }

    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this);
        System.out.println("<---Network system accepts visitor--->\nNetwork system price: "+price);
        return price;
    }
}
