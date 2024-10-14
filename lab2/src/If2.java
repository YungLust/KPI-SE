/**
 *  interface2 has one method to be declared {@link #meth2() meth2}<br>
 *  interface2 extends interface {@link If1 If1}<br>
 *  so you need to declare: {@link #meth1() meth1}
 */
public interface If2 extends If1{
    /**
     *  meth2 prints its name and class where declarated
     */
    public void meth2();
}
