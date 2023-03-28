package OOP_Homework02.Units;

/** Копейщик */

public class Pikeman extends MainUnit {
    protected boolean doubleDamage; // двойной удар

    public Pikeman() {
        super("Pikeman", 6, 8, 8, 8);
        this.doubleDamage = true;
    }
}

