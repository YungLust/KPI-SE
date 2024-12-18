package AbstractFactory;

import Heroes.*;

public class WarriorFactory implements HeroFactory {
    private final String name = "Mario";
    private final int defaultHp = 200;
    private final int defaultDamage = 25;
    private final int defaultRange = 1;
    private final int defaultX = 0;
    private final int defaultY = 0;

    @Override
    public Hero createHero() {
        return new Warrior(defaultHp,defaultDamage,defaultRange,defaultX,defaultY);
    }
}
