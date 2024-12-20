package AbstractFactory;

import Heroes.*;

public interface HeroFactory <T extends Hero> {
    T createHero();
}