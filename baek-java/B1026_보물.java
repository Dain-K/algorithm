import java.util.Arrays;
import java.util.Scanner;

public class B1026_보물 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0; i < N; i++) {
			result += A[i] * B[N-1-i];
		}
		
		System.out.println(result);

		sc.close();

	}

}
