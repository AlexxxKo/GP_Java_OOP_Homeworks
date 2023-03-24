package OOP_Homework01.Units;

/** Маги (общий) */

public class Magician extends MainUnit{
    protected int mana;
    protected int rangeMagic; // расстояние магии

    public Magician(int speed, float hp, int damage, int defence, int mana, int rangeMagic) {
        super(speed, hp, damage, defence);
        this.mana = mana;
        this.rangeMagic = rangeMagic;
    }
}
