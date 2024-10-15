/**
 * Class3 implements interface {@link If3 If3}<br>
 * It overrides methods from interface:<br>
 * {@link #meth1 meth1}, {@link #meth2 meth2()}, {@link #meth3 meth3()}
 */
public class Cl3 implements If3 {
    private If2 if2; // Aggregating If2

    /**
     * Constructor of the class aggregates If2.<br>
     * It accepts an If2 instance
     */
    public Cl3(If2 if2) {
        this.if2 = if2;
    }

    /**
     * It takes object of the class that implements interface {@link If2 If2}<br>
     * It calls interface`s method {@link If2#meth2 If2.meth2()}
     */
    public void setIf2(If2 if2) {
        this.if2 = if2;
        System.out.println("Class3: Gets object of class that implements If2\nCalling its method:");
        System.out.print("Cl3.");
        if2.meth2();
    }
    /**
     * meth3 overrides method from interface {@link If3 If3}
     */
    @Override
    public void meth3() {
        System.out.println("Cl3.meth3()");
    }

    /**
     * meth3 overrides method from interface {@link If2 If2}
     */
    @Override
    public void meth2() {
        System.out.println("Cl3.meth2()");
    }

    /**
     * meth1 overrides method from interface {@link If1 If1}
     */
    @Override
    public void meth1() {
        System.out.println("Cl3.meth1()");
    }
}
