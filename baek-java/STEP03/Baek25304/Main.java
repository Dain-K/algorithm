import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 총금액
		int N = sc.nextInt(); // 물건의 종류 
		int a = 0; // 물건의 가격
		int b = 0; // 물건의 개수
		int sum = 0;
		for(int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += a * b;
		}
		if(sum == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
		
}