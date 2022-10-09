package STEP11.Baek18870;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N]; // 입력 받는 배열
        int[] sortedArr = new int[N]; // 정렬 될 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>(); // rank를 매길 HashMap

        for (int i = 0; i < N; i++) {
            // 입력 값을 두 배열에 넣어준다.
            arr[i] = sortedArr[i] = sc.nextInt();
        }

        Arrays.sort(sortedArr); // 오름차순 정렬을 수행한다.

        int rank = 0;
        // 정렬된 배열을 기준으로 순위를 map에 넣어준다.
        for (int v : sortedArr) {
            if (!rankingMap.containsKey(v)) {
                // 중복이 되지 않을 때만 map에 원소와 그에 대응되는 순위를 넣는다.
                rankingMap.put(v, rank);
                rank++; // 순위를 매길 수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int ranking = rankingMap.get(key); // 원소(key)에 대한 순위(value)를 갖고 온다.
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
        sc.close();

    }
}