package Mediator;

import Heroes.*;
import Visitor.ArenaAnnouncer;

import java.util.ArrayList;
import java.util.List;

public class Arena implements Mediator{
    private List<Hero> heroes = new ArrayList<>();
    private ArenaAnnouncer announcer = new ArenaAnnouncer();

    public void addHero(Hero hero) {
        // announce that new hero is in arena
        announcer.notifySubs("New hero in arena: "+hero.getName());
        //add new hero to subs
        announcer.addSub(hero);
        //add hero to arena
        heroes.add(hero);
    }

    public void removeHero(Hero hero){
        //announce that some hero is eliminated
        announcer.notifySubs(hero.getName()+" got eliminated!");
        //remove dead hero from subs
        announcer.removeSub(hero);
        //remove hero from arena
        heroes.remove(hero);
    }

    public void attack(Hero hero, Hero enemy){
        //attack enemy
        hero.attack(enemy);
        // notify attacker and enemy
        enemy.update("You got attacked by "+hero.getName()+"Remaining health: "+enemy.getHp());
        hero.update("You attack "+enemy.getName());

    }
}
