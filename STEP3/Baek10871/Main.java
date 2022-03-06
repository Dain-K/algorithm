package STEP3.Baek10871;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            if (num < X)
                System.out.print(num + " ");
        }
        sc.close();
    }

}