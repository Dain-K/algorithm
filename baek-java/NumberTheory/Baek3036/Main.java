package NumberTheory.Baek3036;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1000; j > 0; j--) {
                if (arr[i] % j == 0 && arr[0] % j == 0) {
                    System.out.println(arr[0] / j + "/" + arr[i] / j);
                    break;
                }
            }
        }

        sc.close();
    }

}