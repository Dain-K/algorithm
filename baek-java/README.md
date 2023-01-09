# BaekJoon Java 피드백

<details>
<summary> :pencil: 108145번 숫자 카드 </summary>
<div markdown="1">

## 숫자카드

### 내 풀이

- count 정렬을 이용하여 문제 해결

```java
import java.util.Scanner;

public class B10815 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] countP = new int[10000001];
		int[] countM = new int[10000001];
		int input = 0;

		for(int i = 0; i < N; i++) {
			input = sc.nextInt();

			if(input < 0) countM[Math.abs(input)] = 1;
			else countP[input] = 1;
		}

		int M = sc.nextInt();
		int result = 0;

		for(int i = 0; i < M; i++) {
			input = sc.nextInt();
			result = 0;
			if(input < 0) {
				if(countM[Math.abs(input)] == 1) result = 1;
			}else {
				if(countP[input] == 1) result = 1;
			}
			System.out.print(result + " ");
		}
	}
}
```

- 하지만 시간이 오래 걸리는 단점이 있었음
- 그래서 다른 사람의 풀이를 참고하여 공부하고자 함

### 다른사람 풀이

- 이진탐색을 이용하여 문제를 해결

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	static int[] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		// 숫자 카드 개수 N
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];

		// 상근이가 갖고 있는 숫자 카드들
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		// M 입력 받기
		int m = Integer.parseInt(br.readLine());

		// 이진 탐색을 위한 오름차순 정렬
		Arrays.sort(arr);

		// 비교해야할 값 탐색
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < m; i++) {
			int result = BinarySearch(Integer.parseInt(st.nextToken()));
			if(result != -1)
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}
	}

	private static int BinarySearch(int target) {

		int left = 0;
		int right = arr.length - 1;
		int mid;

		while(left <= right) {
			mid = (left + right) / 2;
			if(arr[mid] < target)
				left = mid + 1;
			else if(arr[mid] > target)
				right = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}

```

</div>
</details>
