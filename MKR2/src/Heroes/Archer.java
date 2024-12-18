package Heroes;

public class Archer extends Hero{

    public Archer(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }

    @Override
    public void attack() {
        System.out.println("Heroes.Archer shoots an arrow!");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Archer moves");
        super.move(x,y);
    }
}
