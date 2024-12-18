package Heroes;

public class Warrior extends Hero {
    public Warrior(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }

    @Override
    public void attack() {
        System.out.println("Heroes.Warrior hits with a sword");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Warrior moves");
        super.move(x,y);
    }
}
