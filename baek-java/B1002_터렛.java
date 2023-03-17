import java.util.Scanner;

public class B1002_터렛 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int x1, y1, r1, x2, y2, r2;
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
			
			if((x1==x2) && (y1==y2) && (r1==r2)) { // 원이 완전히 겹칠 경우 무수히 많음
				result =  -1;
			}else if(r1+r2 < distance || Math.abs(r2-r1) > distance) { // 접점이 없을 경우
				result = 0;
			}else if(r1+r2==distance || Math.abs(r1-r2) == distance) {
				result = 1;
			}else {
				result = 2;
			}
			System.out.println(result);
		}
		sc.close();
		
		
	}
		
}
