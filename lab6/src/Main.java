import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main (String[] args){
        Server server = new Server();
        WorkStation station = new WorkStation();
        Cable cable = new Cable( (float) 115.9);
        Server server1 = new Server();
        NetworkCalcPrice calc = new NetworkCalcPrice();
        System.out.println(calc.calculate(server,cable,station,server1));
        WorkStation station1 = new WorkStation();
        Server server2 = new Server();
        System.out.println("*");
        System.out.println(calc.calculate(server,cable,station,station1,server1,server2));
    }
}