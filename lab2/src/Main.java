/**
 * Main class creates objects of every other class and uses all of their functions
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\nClass1:");
        Cl3 Cl3Obj = new Cl3();
        Cl1 Cl1Obj = new Cl1(Cl3Obj);
        Cl1Obj.meth1();

        System.out.println("*\nClass2:");
        Cl2 Cl2Obj = new Cl2();
        Cl2Obj.meth1();
        Cl2Obj.meth2();

        System.out.println("*\nClass3:");
        Cl3Obj.meth1();
        Cl3Obj.meth2();
        Cl3Obj.meth3();
    }
}