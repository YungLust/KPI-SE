/**
 * Class2 implements interface {@link If2 If2}<br>
 * It overrides methods from interface:<br>
 * {@link #meth1 meth1}, {@link #meth2 meth2}
 */
public class Cl2 implements If2{
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
