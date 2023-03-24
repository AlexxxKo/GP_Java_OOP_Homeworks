package OOP_Homework01.Units;

public class MainUnit {
    protected int speed;
    protected float hp;
    protected int damage;
    protected int defence;

    public MainUnit(int speed, float hp, int damage, int defence) {
        this.speed = speed;
        this.hp = hp;
        this.damage = damage;
        this.defence = defence;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) this.speed = speed;
    }
}
