package OOP_Homework03.Units;

import java.util.List;

/** Маги (общий) */

public abstract class MagicianClass extends MainUnit {
    protected int mana;
    protected boolean magic;

    public MagicianClass(String name, int damage, int defence, float hp, int speed, int mana, boolean magic) {
        super(name, damage, defence, hp, speed);
        this.mana = mana;
        this.magic = magic;
    }

    @Override
    public void step(List<MainUnit> team, List<MainUnit> friends) {
//        System.out.println("Наколдовал!");
    }
}
