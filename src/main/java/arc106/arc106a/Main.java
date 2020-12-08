package arc106.arc106a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        List<Long> threes = new ArrayList<>();

        long three = 1;
        threes.add(three);
        for (int i = 1 ; three <= N ; i++) {
            three *= 3;
            threes.add(three);
        }

        List<Long> fives = new ArrayList<>();
        long five = 1;
        fives.add(five);
        for (int i = 1 ; five <= N ; i++) {
            five *= 5;
            fives.add(five);
        }

        for (long t : threes) {
            for (long f : fives) {
                if (t + f == N) {
                    System.out.println(threes.indexOf(t) + " " + fives.indexOf(f));
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
