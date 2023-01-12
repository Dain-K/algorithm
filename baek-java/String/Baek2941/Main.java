package String.Baek2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for (int i = 0; i < str.length; i++) {
            if (s.contains(str[i])) {
                s = s.replace(str[i], "a");
            }
        }
        System.out.println(s.length());
        sc.close();
    }
}