/**
 * Main.Main class creates objects of every other class and uses all of their functions
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\nCreating objects:");
        // Create Cl3 object with temporary null value
        Cl3 cl3 = new Cl3(null);
        // Create Cl2 object with temporary null value
        Cl2 cl2 = new Cl2(null);

        // Set If3 (as Cl3 implements it) for Cl2 object
        cl2.setIf3(cl3);
        System.out.println("*");

        // Set If2 (as Cl2 implements it) for Cl3 object
        cl3.setIf2(cl2);

        //create Cl1 object
        System.out.println("*");
        Cl1 cl1 = new Cl1(cl3);

        System.out.println("\nClass1 methods:");
        cl1.meth1();

        System.out.println("*\nClass2 methods:");
        cl2.meth1();
        cl2.meth2();

        System.out.println("*\nClass3 methods:");

        cl3.meth1();
        cl3.meth2();
        cl3.meth3();
    }
}