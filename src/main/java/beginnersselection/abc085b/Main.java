package beginnersselection.abc085b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < N ; i++) {
            int d = scanner.nextInt();
            if (!list.contains(d)) {
                list.add(d);
            }
        }

        System.out.println(list.size());
    }
}
