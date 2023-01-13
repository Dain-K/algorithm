package Sort.Baek2750;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int num1 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num1;
                    // System.out.println(arr[i]);
                    // System.out.println(arr[j]);
                    // System.out.println("-----");
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}