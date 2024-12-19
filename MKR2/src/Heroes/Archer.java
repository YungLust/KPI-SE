package Heroes;

public class Archer extends Hero{

    public Archer(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("Archer shoots an arrow!");
        super.attack(enemy);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Archer sneaks");
        super.move(1,1);
    }
}
