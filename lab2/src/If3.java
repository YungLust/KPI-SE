/**
 *  interface3 has one method to be declared {@link #meth3 meth3()}.
 *  interface3 extends interfaces {@link If1 If2}, {@link If2 If2}<br>
 *  so you need to declare: {@link #meth1 meth1()}, {@link #meth2 meth2()}
 */
public interface If3 extends If2 {
    /**
     *  meth3 prints its name and class where declarated
     */
    public void meth3();
}
