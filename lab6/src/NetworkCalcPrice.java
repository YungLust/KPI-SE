import java.util.Set;

/**
 * visitor class. It can visit any {@link NetworkElement NetworkElement} object
 * to get its price.
 */
public class NetworkCalcPrice implements NetworkVisitor {
    private float serverPrice = 100;
    private float cablePrice = (float) 2.5;
    private float stationPrice = 50;

    /**
     * method for visiting {@link Server Server} class to get its price
     * @param server is the server which price we want to get
     * @return server`s price
     */
    @Override
    public float visit(Server server) {
        return serverPrice;
    }

    /**
     * method for visiting {@link Cable Cable} class to get its price
     * @param cable is the cable which price we want to get
     * @return cable`s price
     */
    @Override
    public float visit(Cable cable) {
        return cablePrice;
    }

    /**
     * method for visiting {@link WorkStation WorkStation} class to get its price
     * @param station is the work station which price we want to get
     * @return work station`s price
     */
    @Override
    public float visit(WorkStation station) {
        return stationPrice;
    }

    /**
     * method for visiting {@link NetworkSystem NetworkSystem} class to get the price
     * of each element of the system
     * @param system is the network system which price we want to get
     * @return server`s price
     */
    @Override
    public float visit(NetworkSystem system) {
        float systemPrice = 0;
        Set<NetworkElement> elements = system.getElements();
        for (NetworkElement element : elements) {
            systemPrice += element.accept(this);

        }
        return systemPrice;
    }

    /**
     * method to calculate the price of all passed {@link NetworkElement NetworkElement} objects
     * @param elements are {@link NetworkElement NetworkElement} objects
     * @return it returns summed price of every passed {@link NetworkElement NetworkElement} object
     */
    public float calculate(NetworkElement... elements) {
        float price = 0;
        for (NetworkElement element : elements) {
            price += element.accept(this);
        }
        return price;
    }

    /**
     * method to change price for one server
     * this price affects {@link Server Server} class
     * @param serverPrice is new server price
     */
    public void setServerPrice(float serverPrice) {
        this.serverPrice = serverPrice;
    }

    /**
     * method to change price for one metric unit of cable
     * this price affects {@link Cable Cable} class
     * @param cablePrice is new cable price
     */
    public void setCablePrice(float cablePrice) {
        this.cablePrice = cablePrice;
    }

    /**
     * method to change price for one work station
     * this price affects {@link WorkStation WorkStation} class
     * @param stationPrice is new work station`s price
     */
    public void setStationPrice(float stationPrice) {
        this.stationPrice = stationPrice;
    }
}
