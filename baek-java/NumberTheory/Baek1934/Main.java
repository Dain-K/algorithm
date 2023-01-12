package NumberTheory.Baek1934;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 개수

		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int max = A;
			if(B > A) max = B; // 최댓값 지정
			
			for(int j = max; j > 0; j--) { // 공약수가 있는지 찾기
				if(A % j == 0 && B % j == 0) {
					System.out.println(A * B / j);
					break;
				}
			}
		}
		sc.close();
	}
}