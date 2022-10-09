package STEP6.Baek1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            int count = 0;
            for (int j = 0; j < s.length() - 2; j++) {
                for (int z = j + 2; z < s.length(); z++) {
                    if (s.charAt(j) == s.charAt(j + 1))
                        break;
                    else if (s.charAt(j) == s.charAt(z))
                        count += 1;
                }
            }
            if (count == 0)
                result += 1;
        }
        System.out.println(result);
        sc.close();
    }
}