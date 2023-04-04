package OOP_Homework04.Units;

import java.util.List;
import java.util.Random;

public abstract class ShooterClass extends MainUnit {
    protected int arrows; // количество стрел
//    protected int arrowsDamage; // сила дальней атаки
//    protected int arrowsRange; // расстояние дальней атаки

    public ShooterClass(String name, int damage, int defence, float hp, int speed, int x, int y, int arrows) {
        super(name, damage, defence, hp, speed, x, y);
        this.arrows = arrows;
//        this.arrowsDamage = arrowsDamage;
//        this.arrowsRange = arrowsRange;
    }

    @Override
    public void step(List<MainUnit> team, List<MainUnit> friends) {

        if (this.arrows > 0 && this.hp > 0) {
            MainUnit victim = team.get(0);
            double victimDistance = position.getDistance(victim);
            for (MainUnit unit : team) {
                double distance = position.getDistance(unit);
                if (unit.hp > 0 && distance > victimDistance) {
                    victimDistance = distance;
                    victim = unit;
                }
            }
            this.attack(victim, this.damage);
            boolean isPeasant = false;
            for (MainUnit unitFriend : friends) {
                if (unitFriend.getInfo().contains("Peasant") && unitFriend.hp > 0) {
                    isPeasant = true;
                    break;
                }
            }
            if (!isPeasant) this.arrows--;
            System.out.printf("%s -> arrows: %d\n", this.getName(), this.arrows);
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
