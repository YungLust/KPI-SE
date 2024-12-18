package AbstractFactory;

import Heroes.*;

public class MageFactory implements HeroFactory {
    private final int defaultHp = 80;
    private final int defaultDamage = 40;
    private final int defaultRange = 12;
    private final int defaultX = 15;
    private final int defaultY = 15;

    @Override
    public Hero createHero() {
        return new Mage(defaultHp,defaultDamage,defaultRange,defaultX,defaultY);
    }
}
