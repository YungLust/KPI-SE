package Heroes;

import java.util.Arrays;

public class Mage extends Hero{
    public Mage(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }
    @Override
    public boolean attack(Hero enemy) {
        if (super.attack(enemy)){
            System.out.println("Mage casts spell");
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void move(int x, int y) {
        super.move(x,y);
        System.out.println("Mage teleports to " + Arrays.toString(super.getCoords()));
    }
}
