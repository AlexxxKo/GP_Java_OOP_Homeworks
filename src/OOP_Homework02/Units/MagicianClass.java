package OOP_Homework02.Units;

/** Маги (общий) */

public abstract class MagicianClass extends MainUnit {
    protected int mana;
    protected int rangeMagic; // расстояние магии

    public MagicianClass(String name, int damage, int defence, float hp, int speed, int mana, int rangeMagic) {
        super(name, damage, defence, hp, speed);
        this.mana = mana;
        this.rangeMagic = rangeMagic;
    }
}
