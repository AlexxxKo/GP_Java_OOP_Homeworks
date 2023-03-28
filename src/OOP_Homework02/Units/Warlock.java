package OOP_Homework02.Units;

/** Колдун */
public class Warlock extends MagicianClass {
    int defacement; // порча

    public Warlock() {
        super("Warlock", 3, 6, 3, 6, 30, 30);
        this.defacement = 7;
    }
}
