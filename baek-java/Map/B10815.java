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
		
		sc.close();

	}
	
}
