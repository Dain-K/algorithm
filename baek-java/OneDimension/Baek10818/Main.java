package OneDimension.Baek10818;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        long max = -1000000, min = 1000000;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println(min + " " + max);
        sc.close();
    }

}
