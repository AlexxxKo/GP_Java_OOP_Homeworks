package OOP_Homework03.Units;

import java.util.List;
import java.util.Random;

public abstract class MainUnit implements UnitsInterface {
    protected int damage;
    protected int defence;
    protected float hp;
    protected String name;
    protected int speed;

    static {
    }

    public MainUnit(String name, int damage, int defence, float hp, int speed) {
        this.damage = damage;
        this.defence = defence;
        this.hp = hp;
        this.name = name;
        this.speed = speed;
    }

    public String getInfo() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void step(List<MainUnit> team, List<MainUnit> friends) {
//        System.out.println("Step");
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
}
