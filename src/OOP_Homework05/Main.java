package OOP_Homework05;

import OOP_Homework05.Units.*;

import java.util.*;

public class Main {
    public static final int TEAM_SIZE = 10;
    public static ArrayList<MainUnit> team1;
    public static ArrayList<MainUnit> team2;
    public static ArrayList<MainUnit> allUnits;

    public static void main(String[] args) {
        init();

        Scanner sc = new Scanner(System.in);

        while (true) {
            ConsoleView.view();
            makeStep();
            sc.nextLine();
        }
    }

    public static void init() {
        team1 = new ArrayList<>();
        team2 = new ArrayList<>();
        allUnits = new ArrayList<>();

        int countPeasant = 11;
        int countRobber = 10;
        int countSniper = 10;
        int countWarlock = 10;
        int countPikeman = 20;
        int countArbalester = 20;
        int countMonk = 20;

        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team1.add(new Peasant("Peasant" + countPeasant, 1, i + 1));
                    countPeasant++;
                    break;
                case 1:
                    team1.add(new Robber("Robber" + countRobber, 1, i + 1));
                    countRobber++;
                    break;
                case 2:
                    team1.add(new Sniper("Sniper" + countSniper, 1, i + 1));
                    countSniper++;
                    break;
                case 3:
                    team1.add(new Warlock("Warlock" + countWarlock, 1, i + 1));
                    countWarlock++;
                    break;
            }
        }
        countPeasant = 21;

        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Peasant("Peasant" + countPikeman, TEAM_SIZE, i+1));
                    countPeasant++;
                    break;
                case 1:
                    team2.add(new Pikeman("Pikeman" + countPikeman, TEAM_SIZE, i+1));
                    countPikeman++;
                    break;
                case 2:
                    team2.add(new Arbalester("Arbalester" + countArbalester, TEAM_SIZE, i+1));
                    countArbalester++;
                    break;
                case 3:
                    team2.add(new Monk("Monk" + countMonk, TEAM_SIZE, i+1));
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

        allUnits.addAll(team1);
        allUnits.addAll(team2);

//        team1.sort(new Comparator<MainUnit>() {
//            @Override
//            public int compare(MainUnit o1, MainUnit o2) {
//                if (o1.getSpeed() == o2.getSpeed()) return 0;
//                else if (o1.getSpeed() < o2.getSpeed()) return 1;
//                else return -1;
//            };
//        });
//
//        team2.sort(new Comparator<MainUnit>() {
//            @Override
//            public int compare(MainUnit o1, MainUnit o2) {
//                if (o1.getSpeed() == o2.getSpeed()) return 0;
//                else if (o1.getSpeed() < o2.getSpeed()) return 1;
//                else return -1;
//            }
//        });

        allUnits.sort(new Comparator<MainUnit>() {
            @Override
            public int compare(MainUnit o1, MainUnit o2) {
                if (o1.getSpeed() == o2.getSpeed()) return 0;
                else if (o1.getSpeed() < o2.getSpeed()) return 1;
                else return -1;
            };
        });


//        System.out.println("Team 1:");
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i).getInfo());
//        }
//
//        System.out.println("\nTeam 2:");
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i).getInfo());
//        }
//
//        System.out.println();
//
//        System.out.println("All units:");
//        for (int i = 0; i < allUnits.size(); i++) {
//            System.out.printf("%d -> %s\n", allUnits.get(i).getSpeed(), allUnits.get(i).getInfo());
//        }
//
    }

    private static void makeStep() {
        System.out.println();
        allUnits.forEach(u -> u.step(team2, team1));
        System.out.println();
        allUnits.forEach(u -> u.step(team1, team2));
    }
}