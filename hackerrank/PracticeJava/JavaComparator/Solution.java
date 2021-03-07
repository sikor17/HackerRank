package hackerrank.PracticeJava.JavaComparator;

import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score == b.score)
            return a.name.compareTo(b.name);
        else if (b.score > a.score)
            return 1;
        else
            return -1;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] student = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            student[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(student, checker);
        for (int i = 0; i < student.length; i++) {
            System.out.printf("%s %s\n", student[i].name, student[i].score);
        }
    }


}