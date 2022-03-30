package STEP9.Baek4153;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		while(true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a==0 && b==0 && c==0)
				break;
			
			String s = "";
			
			if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
				s = "right";
			else if(Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
				s = "right";
			else if(Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
				s = "right";
			else
				s = "wrong";
			
			System.out.println(s);
			
		}
		
		sc.close();
		
	}
	
}