package OOP_Homework02;

import OOP_Homework02.Units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MainUnit> list1 = new ArrayList<>();
        List<MainUnit> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list1.add(new Arbalester());
                    break;
                case 1:
                    list1.add(new Monk());
                    break;
                case 2:
                    list1.add(new Peasant());
                    break;
                case 3:
                    list1.add(new Pikeman());
                    break;
                case 4:
                    list1.add(new Robber());
                    break;
                case 5:
                    list1.add(new Sniper());
                    break;
                case 6:
                    list1.add(new Warlock());
                    break;
            }

            switch (new Random().nextInt(7)) {
                case 0:
                    list2.add(new Arbalester());
                    break;
                case 1:
                    list2.add(new Monk());
                    break;
                case 2:
                    list2.add(new Peasant());
                    break;
                case 3:
                    list2.add(new Pikeman());
                    break;
                case 4:
                    list2.add(new Robber());
                    break;
                case 5:
                    list2.add(new Sniper());
                    break;
                case 6:
                    list2.add(new Warlock());
                    break;
            }
        }

        System.out.println("Team 1:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getInfo());
        }

        System.out.println("\nTeam 2:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).getInfo());
        }
    }
}