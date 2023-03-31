package OOP_Homework03.Units;

import java.util.List;

public class WarriorClass extends MainUnit {
    public WarriorClass(String name, int damage, int defence, float hp, int speed) {
        super(name, damage, defence, hp, speed);
    }

    @Override
    public void step(List<MainUnit> team, List<MainUnit> friends) {
//        System.out.println("Пошёл или ударил. Забыл уже");
    }
}
