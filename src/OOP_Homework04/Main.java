package OOP_Homework04;

import OOP_Homework04.Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MainUnit> list1 = new ArrayList<>();
        List<MainUnit> list2 = new ArrayList<>();
        int countPeasant = 11;
        int countRobber = 10;
        int countSniper = 10;
        int countWarlock = 10;
        int countPikeman = 20;
        int countArbalester = 20;
        int countMonk = 20;

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    list1.add(new Peasant("Peasant" + countPeasant, 1, i + 1));
                    countPeasant++;
                    break;
                case 1:
                    list1.add(new Robber("Robber" + countRobber, 1, i + 1));
                    countRobber++;
                    break;
                case 2:
                    list1.add(new Sniper("Sniper" + countSniper, 1, i + 1));
                    countSniper++;
                    break;
                case 3:
                    list1.add(new Warlock("Warlock" + countWarlock, 1, i + 1));
                    countWarlock++;
                    break;
            }
        }
            countPeasant = 21;

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    list2.add(new Peasant("Peasant" + countPikeman, 10, i+1));
                    countPeasant++;
                    break;
                case 1:
                    list2.add(new Pikeman("Pikeman" + countPikeman, 10, i+1));
                    countPikeman++;
                    break;
                case 2:
                    list2.add(new Arbalester("Arbalester" + countArbalester, 10, i+1));
                    countArbalester++;
                    break;
                case 3:
                    list2.add(new Monk("Monk" + countMonk, 10, i+1));
                    countMonk++;
                    break;
            }

//            switch (new Random().nextInt(4)) {
//                case 0:
//                    list1.add(new Peasant("Peasant" + countPeasant, new Random().nextInt(1, 6), i));
//                    countPeasant++;
//                    break;
//                case 1:
//                    list1.add(new Robber("Robber" + countRobber, new Random().nextInt(1, 6), i));
//                    countRobber++;
//                    break;
//                case 2:
//                    list1.add(new Sniper("Sniper" + countSniper, new Random().nextInt(1, 6), i));
//                    countSniper++;
//                    break;
//                case 3:
//                    list1.add(new Warlock("Warlock" + countWarlock, new Random().nextInt(1, 6), i));
//                    countWarlock++;
//                    break;
//            }
//
//            countPeasant = 21;
//
//            switch (new Random().nextInt(4)) {
//                case 0:
//                    list2.add(new Peasant("Peasant" + countPikeman, new Random().nextInt(6, 11), i));
//                    countPeasant++;
//                    break;
//                case 1:
//                    list2.add(new Pikeman("Pikeman" + countPikeman, new Random().nextInt(6, 11), i));
//                    countPikeman++;
//                    break;
//                case 2:
//                    list2.add(new Arbalester("Arbalester" + countArbalester, new Random().nextInt(6, 11), i));
//                    countArbalester++;
//                    break;
//                case 3:
//                    list2.add(new Monk("Monk" + countMonk, new Random().nextInt(6, 11), i));
//                    countMonk++;
//                    break;
//            }
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

        allUnits.forEach(u -> u.step(list2, list1));
        System.out.println();
        allUnits.forEach(u -> u.step(list1, list2));
    }
}