package Heroes;

import java.util.Arrays;

public class Warrior extends Hero {
    public Warrior(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }

    @Override
    public boolean attack(Hero enemy) {
        if (super.attack(enemy)) {
            System.out.println("Warrior hits with a sword");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
        System.out.println("Warrior rushes to " + Arrays.toString(super.getCoords()));
    }
}
