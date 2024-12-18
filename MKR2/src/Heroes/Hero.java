package Heroes;

import Visitor.*;

public abstract class Hero implements Subscriber {
    private String name;
    private int hp;
    private int damage;
    private int range;
    private int xCoord;
    private int yCoord;

    public void attack(Hero enemy){
        enemy.getHit(damage);
    }
    public void move(int x, int y){
        xCoord += x;
        yCoord += y;
    }

    public Hero(String name, int hp, int damage, int range, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.range = range;
        xCoord = x;
        yCoord = y;
    }

    public void getHit(int hitDamage){
        hp -= hitDamage;
    }

    public String getName(){
        return name;
    }

    @Override
    public void update(Hero h){
        System.out.println("New character in arena - " + h.getName());
    }
}
