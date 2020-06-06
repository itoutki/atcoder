package beginnersselection.abc049c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        boolean flag = true;
        while(flag) {
            if (S.endsWith("dreamer")) {
                S = S.substring(0, S.length() - 7);
            } else if (S.endsWith("dream")) {
                S = S.substring(0, S.length() - 5);
            } else if (S.endsWith("eraser")) {
                S = S.substring(0, S.length() - 6);
            } else if (S. endsWith("erase")) {
                S = S.substring(0, S.length() - 5);
            } else {
                flag = false;
            }
        }

        if (S.equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
