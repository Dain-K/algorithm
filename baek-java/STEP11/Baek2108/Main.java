package STEP11.Baek2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0; // 산술평균
		int mid = 0; // 중앙값
		int[] max_arr = new int[8001]; // 최빈값 배열
		int max = -4000, min = 4000; // 범위

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			// 산술평균
			sum += arr[i];

			// 최빈값
			max_arr[arr[i] + 4000]++;

			// 범위
			if (N == 1) {
				max = 0;
				min = 0;
			} else {
				if (max < arr[i]) {
					max = arr[i];
				}
				if (min > arr[i]) {
					min = arr[i];
				}
			}
		}

		// 중앙값
		if (N == 1) {
			mid = arr[0];
		} else {
			Arrays.sort(arr);
			mid = arr[N / 2];
		}

		// 최빈값
		int max_cnt = 0;
		int result = 0;
		for (int i = 0; i < max_arr.length; i++) {
			if (max_cnt < max_arr[i]) {
				max_cnt = max_arr[i];
				result = i - 4000;
			}
		}

		int cnt = 0;
		for (int i = 0; i < max_arr.length; i++) {
			if (max_cnt == max_arr[i]) {
				result = i - 4000;
				if (cnt == 1) {
					break;
				}
				cnt++;
			}
		}

		System.out.println((int) Math.round((double) sum / N)); // 산술평균
		System.out.println(mid); // 중앙값
		System.out.println(result); // 최빈값
		System.out.println(max - min); // 범위
		br.close();
	}

}
