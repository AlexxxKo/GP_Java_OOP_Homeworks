package OOP_Homework01.Units;

/** Снайпер */
public class Sniper extends Shooter {
    protected boolean doubleArrow; // двойной выстрел

    public Sniper() {
        super(4, 6, 3, 3, 20, 11, 11);
        this.doubleArrow = true;
    }

    public void doubleArrow() {

    }
}
