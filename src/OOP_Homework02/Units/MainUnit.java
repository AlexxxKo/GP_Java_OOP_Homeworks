package OOP_Homework02.Units;

public abstract class MainUnit implements UnitsInterface {
    protected int damage;
    protected int defence;
    protected float hp;
    protected String name;
    protected int speed;

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

    @Override
    public void step() {

    }
}
