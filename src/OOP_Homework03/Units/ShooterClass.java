package OOP_Homework03.Units;

import java.util.List;
import java.util.Random;

public abstract class ShooterClass extends MainUnit {
    protected int arrows; // количество стрел
//    protected int arrowsDamage; // сила дальней атаки
//    protected int arrowsRange; // расстояние дальней атаки

    public ShooterClass(String name, int damage, int defence, float hp, int speed, int arrows) {
        super(name, damage, defence, hp, speed);
        this.arrows = arrows;
//        this.arrowsDamage = arrowsDamage;
//        this.arrowsRange = arrowsRange;
    }

    @Override
    public void step(List<MainUnit> team, List<MainUnit> friends) {
        if (this.arrows > 0 && this.hp > 0) {
            for (MainUnit unit : team) {
                if (unit.hp > 0) {
                    this.attack(unit, this.damage);
                    boolean isPeasant = false;
                    for (MainUnit unitFriend : friends) {
                        if (unitFriend.getInfo().equals("Peasant") && unitFriend.hp > 0) {
                            isPeasant = true;
                            break;
                        }
                    }
                    if (!isPeasant) this.arrows--;
                    System.out.printf("%s -> arrows: %d\n", this.getName(), this.arrows);
                }
            }
        }
    }

    @Override
    protected void attack(MainUnit target, int damage) {
        Random rnd = new Random();
        int rndDamage = rnd.nextInt(1, damage + 1);
        float newHp = target.getHp(rndDamage);
        System.out.printf("%s attack %s\n", this.getName(), target.getName());
        System.out.printf("%s hp = %f\n", target.getName(), newHp);
    }
}
