import java.util.Arrays;
import java.util.Scanner;

public class B2587_대표값2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		Arrays.sort(num);
		
		System.out.println(sum / 5);
		System.out.println(num[2]);

		sc.close();
	}
		
}