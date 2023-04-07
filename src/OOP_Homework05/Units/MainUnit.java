package OOP_Homework05.Units;

import java.util.List;

public abstract class MainUnit implements UnitsInterface {
    protected int damage;
    protected int defence;
    protected float hp;
    protected String name;
    protected int speed;
    protected Position position;

    static {
    }

    public MainUnit(String name, int damage, int defence, float hp, int speed, int x, int y) {
        this.damage = damage;
        this.defence = defence;
        this.hp = hp;
        this.name = name;
        this.speed = speed;
        position = new Position(x, y);
    }

    public String getInfo() {
        return name + " " + this.position.getPosition();
    }

    public int getSpeed() {
        return speed;
    }

//    @Override
//    public String toString() {
//
//    }

    @Override
    public void step(List<MainUnit> team, List<MainUnit> friends) {

    }

    protected void attack(MainUnit target, int damage) {
    }

    public String getName() {
        return name;
    }

    public float getHp(int damage) {
        float newHp = this.hp - damage;
        if (newHp > 0) {
            this.hp = newHp;
        } else {
            this.hp = 0;
        }
        return this.hp;
    }

    public float getCurrentHp() {
        return this.hp;
    }

    public Position getPosition() {
        return this.position;
    }



}
