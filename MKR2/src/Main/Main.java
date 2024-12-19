package Main;

import AbstractFactory.*;
import Heroes.*;
import Visitor.*;

public class Main {
    public static void main(String[] args){
        ArcherFactory archerFactory = new ArcherFactory();
        WarriorFactory warriorFactory = new WarriorFactory();
        MageFactory mageFactory = new MageFactory();
        Hero mage = mageFactory.createHero();
        mage.update("You just spawned!");
    }
}
