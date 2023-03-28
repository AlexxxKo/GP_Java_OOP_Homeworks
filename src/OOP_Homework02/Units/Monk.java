package OOP_Homework02.Units;

/** Монах */
public class Monk extends MagicianClass {
    protected int medic; // лечение

    public Monk() {
        super("Monk", 4, 7, 3, 7, 25, 25);
        this.medic = 10;
    }
}
