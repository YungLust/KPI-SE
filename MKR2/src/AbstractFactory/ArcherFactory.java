package AbstractFactory;

import Heroes.*;

public class ArcherFactory implements HeroFactory {
    private final int defaultHp = 100;
    private final int defaultDamage = 30;
    private final int defaultRange = 10;
    private final int defaultX = 10;
    private final int defaultY = 10;

    @Override
    public Hero createHero() {
        return new Archer(defaultHp,defaultDamage,defaultRange,defaultX,defaultY);
    }
}
