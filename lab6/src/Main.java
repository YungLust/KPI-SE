import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main (String[] args){
        /*Server server = new Server();
        WorkStation station = new WorkStation();
        Cable cable = new Cable( 115.9);
        Server server1 = new Server();
        System.out.println(calc.calculate(server,cable,station,server1));
        WorkStation station1 = new WorkStation();
        Server server2 = new Server();
        System.out.println("*");*/
        Cable redCable = new Cable(12.4);
        Cable blueCable = new Cable(42.1);
        Cable greenCable = new Cable(28.5);
        Server mainServer = new Server();
        NetworkSystem systemRoom5 = new NetworkSystem(redCable,blueCable,greenCable,mainServer);
        NetworkCalcPrice calc = new NetworkCalcPrice();
        System.out.println(calc.calculate(systemRoom5));
    }
}