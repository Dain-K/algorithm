package Backtracking.Baek15650;

import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static int N, M;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        DFS(1, 0);

        sc.close();
    }

    public static void DFS(int at, int depth) {

        if (depth == M) {

            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;

        }

        for (int i = at; i <= N; i++) {

            arr[depth] = i;
            DFS(i + 1, depth + 1);

        }
    }
}