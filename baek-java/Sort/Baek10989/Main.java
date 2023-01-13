package Sort.Baek10989;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] count = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 각 원소들의 인덱스 값을 1씩 증가
            count[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000; i++) { // 1부터 숫자 시작
            // System.out.println(count[i]);
            while (count[i] > 0) { // 인덱스가 1 이상인 것을 출력
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);

    }
}