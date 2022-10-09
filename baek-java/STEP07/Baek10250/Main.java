package STEP7.Baek10250;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 케이스 출력
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); // 호텔의 층 수
            int W = sc.nextInt(); // 각 층의 방 수
            int N = sc.nextInt(); // 몇 번째 손님인지

            // 호텔 방 호수
            int[][] room = new int[W + 1][H + 1];
            int num = 100;
            for (int j = 1; j <= W; j++) {
                for (int z = 1; z <= H; z++) {
                    room[j][z] = j + num * z;
                }
            }
            int a = N / H + 1;
            int b = N % H;
            if (b == 0) {
                a = N / H;
                b = H;
            }
            System.out.println(room[a][b]);
        }

        sc.close();
    }
}