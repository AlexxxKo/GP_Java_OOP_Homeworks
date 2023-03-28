package OOP_Homework02.Units;

/** Снайпер */
public class Sniper extends ShooterClass {
    protected boolean doubleArrow; // двойной выстрел

    public Sniper() {
        super("Sniper", 4, 6, 3, 3, 20, 11, 11);
        this.doubleArrow = true;
    }
}
