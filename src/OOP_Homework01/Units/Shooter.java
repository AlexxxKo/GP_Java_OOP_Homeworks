package OOP_Homework01.Units;

public class Shooter extends MainUnit{
    protected int arrows; // количество стрел
    protected int arrowsDamage; // сила дальней атаки
    protected int arrowsRange; // расстояние дальней атаки

    public Shooter(int speed, float hp, int damage, int defence, int arrows, int arrowsDamage, int arrowsRange) {
        super(speed, hp, damage, defence);
        this.arrows = arrows;
        this.arrowsDamage = arrowsDamage;
        this.arrowsRange = arrowsRange;
    }
}
