/**
 * Class1 implements interface {@link If1 If1}<br>
 * It overrides method from interface: {@link #meth1 meth1}<br>
 * Additionally it creates {@link Cl3 Cl3} object to call its method {@link Cl3#meth1 meth1}
 */
public class Cl1 implements If1 {
    private Cl3 Cl3Obj;

    /**
     * Class1 constructor receives {@link Cl3 Cl3} object
     */
    public Cl1(Cl3 Cl3Obj) {
        this.Cl3Obj = Cl3Obj;
        System.out.println("Cl1 constructor receives Cl3 object");
        System.out.print("Cl1.");
        Cl3Obj.meth1();
    }
    /**
     * meth1 overrides method from interface {@link If1 If1}
     */
    @Override
    public void meth1() {
        System.out.println("Cl1.meth1()");
    }
}
