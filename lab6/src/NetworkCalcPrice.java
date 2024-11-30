import java.util.Set;

public class NetworkCalcPrice implements NetworkVisitor {
    private float serverPrice = 100;
    private float cablePrice = (float) 2.5;
    private float stationPrice = 50;

    @Override
    public float visit(Server server) {
        return serverPrice;
    }

    @Override
    public float visit(Cable cable) {
        return cablePrice;
    }

    @Override
    public float visit(WorkStation station) {
        return stationPrice;
    }

    @Override
    public float visit(NetworkSystem system) {
        float systemPrice = 0;
        Set<NetworkElement> elements = system.getElements();
        for (NetworkElement element : elements) {
            systemPrice += element.accept(this);

        }
        return systemPrice;
    }

    public float calculate(NetworkElement... elements) {
        float price = 0;
        for (NetworkElement element : elements) {
            price += element.accept(this);
        }
        return price;
    }

    public void setServerPrice(float serverPrice) {
        this.serverPrice = serverPrice;
    }

    public void setCablePrice(float cablePrice) {
        this.cablePrice = cablePrice;
    }

    public void setStationPrice(float stationPrice) {
        this.stationPrice = stationPrice;
    }
}
