package OOP_Homework02.Units;

/** Разбойник */

public class Robber extends MainUnit {
    protected int agility; // ловкость

    public Robber() {
        super("Robber", 5, 5, 3, 3);
        this.agility = 8;
    }
}
