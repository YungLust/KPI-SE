package Heroes;

import java.util.Arrays;

public class Archer extends Hero{

    public Archer(String name, int hp, int damage, int range, int x, int y) {
        super(name, hp, damage, range, x, y);
    }

    @Override
    public boolean attack(Hero enemy) {
        if (super.attack(enemy)){
            System.out.println("Archer shoots an arrow!");
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void move(int x, int y) {
        super.move(x,y);
        System.out.println("Archer sneaks to " + Arrays.toString(super.getCoords()));
    }
}
