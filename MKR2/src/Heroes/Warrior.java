package Heroes;

public class Warrior extends Hero {
    public Warrior(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("Warrior hits with a sword");
        super.attack(enemy);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Warrior rushes");
        super.move(5,5);
    }
}
