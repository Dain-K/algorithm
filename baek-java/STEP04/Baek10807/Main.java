import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 정수의 개수
		int[] num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			if(v == num[i])
				cnt++;
		}
		System.out.println(cnt);
	}
		
}