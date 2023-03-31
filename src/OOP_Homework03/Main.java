package OOP_Homework03;

import OOP_Homework03.Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MainUnit> list1 = new ArrayList<>();
        List<MainUnit> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    list1.add(new Peasant());
                    break;
                case 1:
                    list1.add(new Robber());
                    break;
                case 2:
                    list1.add(new Sniper());
                    break;
                case 3:
                    list1.add(new Warlock());
                    break;
            }

            switch (new Random().nextInt(4)) {
                case 0:
                    list2.add(new Peasant());
                    break;
                case 1:
                    list2.add(new Pikeman());
                    break;
                case 2:
                    list2.add(new Arbalester());
                    break;
                case 3:
                    list2.add(new Monk());
                    break;
            }
        }

        List<MainUnit> allUnits = new ArrayList<>();
        allUnits.addAll(list1);
        allUnits.addAll(list2);

        list1.sort(new Comparator<MainUnit>() {
            @Override
            public int compare(MainUnit o1, MainUnit o2) {
                if (o1.getSpeed() == o2.getSpeed()) return 0;
                else if (o1.getSpeed() < o2.getSpeed()) return 1;
                else return -1;
            }
        });

        list2.sort(new Comparator<MainUnit>() {
            @Override
            public int compare(MainUnit o1, MainUnit o2) {
                if (o1.getSpeed() == o2.getSpeed()) return 0;
                else if (o1.getSpeed() < o2.getSpeed()) return 1;
                else return -1;
            }
        });

        allUnits.sort(new Comparator<MainUnit>() {
            @Override
            public int compare(MainUnit o1, MainUnit o2) {
                if (o1.getSpeed() == o2.getSpeed()) return 0;
                else if (o1.getSpeed() < o2.getSpeed()) return 1;
                else return -1;
            }
        });

        System.out.println("Team 1:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getInfo());
        }

        System.out.println("\nTeam 2:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).getInfo());
        }

        System.out.println();

        System.out.println("All units:");
        for (int i = 0; i < allUnits.size(); i++) {
            System.out.printf("%d -> %s\n", allUnits.get(i).getSpeed(), allUnits.get(i).getInfo());
        }

        System.out.println();

        list1.forEach(u -> u.step(list2, list1));
        System.out.println();
        list2.forEach(u -> u.step(list1, list2));
    }
}