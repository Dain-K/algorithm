import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17608 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 막대기의 개수
		int[] arr = new int[N]; // 입력받은 막대기의 높이 배열
		int count = 1; // 제일 처음 막대기는 보이므로 1
		
		for(int i = 0; i < N; i++) { // 막대기의 높이를 입력받음
			arr[i] = Integer.parseInt(br.readLine());
		}
		int last = arr[N-1]; // 마지막 막대기의 높이
		int max = last; // 뒤에서 기준으로 max 위의 막대기만 보임
		for(int i = N-2; i >= 0; i--) {
			if(last < arr[i]) { // 마지막 막대기보다 크고
				if(max < arr[i]) { // 제일 높은 막대기보다 크면
					count++; // 막대기가 보임
					max = arr[i];
				}
			}
		}
		System.out.println(count);
	}
}
