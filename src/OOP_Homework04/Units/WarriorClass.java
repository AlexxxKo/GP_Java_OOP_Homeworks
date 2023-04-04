package OOP_Homework04.Units;

import java.util.List;

public class WarriorClass extends MainUnit {
    public WarriorClass(String name, int damage, int defence, float hp, int speed, int x, int y) {
        super(name, damage, defence, hp, speed, x, y);
    }

    @Override
    public void step(List<MainUnit> team, List<MainUnit> friends) {
//        System.out.println("Пошёл или ударил. Забыл уже");
    }
}
