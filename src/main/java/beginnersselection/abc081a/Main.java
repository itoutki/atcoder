package beginnersselection.abc081a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        char[] chars = s.toCharArray();
        int cnt = 0;
        for(int i = 0 ; i < chars.length ; i++) {
            if (chars[i] == '1') cnt++;
        }

        System.out.println(cnt);
    }
}
