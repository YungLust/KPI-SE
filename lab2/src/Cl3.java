/**
 * Class3 implements interface {@link If3 If3}<br>
 * It overrides methods from interface:<br>
 * {@link #meth1 meth1}, {@link #meth2 meth2}, {@link #meth3 meth3}
 */
public class Cl3 implements If3 {
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
