package OOP_Homework02.Units;

public abstract class ShooterClass extends MainUnit {
    protected int arrows; // количество стрел
    protected int arrowsDamage; // сила дальней атаки
    protected int arrowsRange; // расстояние дальней атаки

    public ShooterClass(String name, int damage, int defence, float hp, int speed, int arrows, int arrowsDamage, int arrowsRange) {
        super(name, damage, defence, hp, speed);
        this.arrows = arrows;
        this.arrowsDamage = arrowsDamage;
        this.arrowsRange = arrowsRange;
    }
}
