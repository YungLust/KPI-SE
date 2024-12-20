package Main;

import AbstractFactory.*;
import Heroes.*;
import Mediator.Arena;
import Visitor.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArcherFactory archerFactory = new ArcherFactory();
        WarriorFactory warriorFactory = new WarriorFactory();
        MageFactory mageFactory = new MageFactory();

        Archer archer = archerFactory.createHero();
        Warrior warrior = warriorFactory.createHero();
        Mage mage = mageFactory.createHero();

        Arena arena = new Arena();
        arena.addHero(archer);
        arena.addHero(warrior);
        arena.addHero(mage);

        System.out.println(Arrays.toString(mage.getCoords()) + " , " + mage.getRange());
        System.out.println(Arrays.toString(warrior.getCoords()) + ": " + warrior.getHp() + " hp");
        arena.attack(mage, warrior);
        warrior.move(10, 5);
        arena.attack(mage, warrior);
        warrior.move(5, 10);
        arena.attack(warrior, mage);
        arena.attack(warrior, mage);
        arena.attack(warrior, mage);
        arena.attack(warrior, mage);

    }
}
