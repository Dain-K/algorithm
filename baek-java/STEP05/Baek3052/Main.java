package STEP5.Baek3052;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int[] num = new int[100];
        int x = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            x = arr[i] % 42;
            num[x] = num[x] + 1;
        }
        for (int j = 0; j < 100; j++) {
            if (num[j] != 0)
                cnt++;
        }
        System.out.println(cnt);

        sc.close();
    }

}
