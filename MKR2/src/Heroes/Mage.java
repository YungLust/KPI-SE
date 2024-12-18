package Heroes;

public class Mage extends Hero{
    public Mage(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("Mage casts spell");
        super.attack(enemy);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Mage teleports");
        super.move(x,y);
    }
}
