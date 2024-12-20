package Heroes;

import Visitor.*;

public abstract class Hero implements Subscriber {
    private String name;
    private int hp;
    private int damage;
    private int range;
    private int xCoord;
    private int yCoord;

    public boolean attack(Hero enemy){
        //calculate distance between enemy and hero
        int distanceX = Math.abs(xCoord - enemy.getxCoord());
        int distanceY = Math.abs(yCoord - enemy.getyCoord());
        int distance = (int) Math.round(Math.sqrt(Math.pow(distanceX,2) + Math.pow(distanceY,2)));
        if (distance < range){
            enemy.getHit(damage);
            return true;
        }
        else {
            System.out.println("Enemy not in range. Attack is missed");
            return false;
        }

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

    private void getHit(int hitDamage){
        hp -= hitDamage;
    }

    @Override
    public void update(String message){
        Class<? extends Hero> c = this.getClass();
        System.out.println(c.getName()+" - "+name+"| notified: "+message);

    }

    public int[] getCoords(){
        return new int[]{xCoord,yCoord};
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }
}
