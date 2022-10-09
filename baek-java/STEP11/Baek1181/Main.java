package STEP11.Baek1181;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            s[i] = sc.nextLine();
        }

        Arrays.sort(s, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    // 단어의 길이가 같을 경우
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(s[0]);

        for (int i = 1; i < N; i++) {
            if (!s[i].equals(s[i - 1])) {
                System.out.println(s[i]);
            }
        }

        sc.close();
    }
}