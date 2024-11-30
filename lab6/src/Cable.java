public class Cable implements NetworkElement{
    private float length;

    public Cable(float length){
        this.length = length;
    }

    @Override
    public float accept(NetworkVisitor visitor) {
        float price = visitor.visit(this) * length;
        System.out.println("Cable accepts visitor:\nCable price (according to length): "+price);
        return price;
    }
}
