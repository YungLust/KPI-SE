package Mediator;

import Heroes.*;

import java.util.ArrayList;
import java.util.List;

public class Arena implements  Mediator{
    private List<Hero> heroes = new ArrayList<>();

    public void addHero(Hero hero) {
        heroes.add(hero);
        System.out.println(hero.getName() + " has entered the arena.");
    }
}
