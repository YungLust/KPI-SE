/**
 * Class2 implements interface {@link If2 If2}<br>
 * It overrides methods from interface:<br>
 * {@link #meth1 meth1}, {@link #meth2 meth2()}
 */
public class Cl2 implements If2{
    private If3 if3; // Aggregating If3

    /**
     * Constructor of the class aggregates If3.<br>
     * It accepts an If3 instance
     */
    public Cl2(If3 if3) {
        this.if3 = if3;
    }

    /**
     * It takes object of the class that implements interface {@link If3 If3}<br>
     * It calls interface`s method {@link If3#meth3 If3.meth3()}
     */
    public void setIf3(If3 if3) {
        this.if3 = if3;
        System.out.println("Class2: Gets object of class that implements If3\nCalling its method:");
        System.out.print("Cl2.");
        if3.meth3();
    }
    /**
     * meth2 overrides method from interface {@link If2 If2}
     */
    @Override
    public void meth2(){
        System.out.println("Cl2.meth2()");
    }
    /**
     * meth1 overrides method from interface {@link If1 If1}
     */
    @Override
    public void meth1() {
        System.out.println("Cl2.meth1()");
    }
}
