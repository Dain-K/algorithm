package STEP11.Baek11650;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]) { // 첫번째 원소가 같을 경우
                return e1[1] - e2[1]; // 두번째 원소 비교
            } else {
                return e1[0] - e2[0]; // 첫번째 원소 비교
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        sc.close();
    }
}