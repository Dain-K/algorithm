import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B2440_별찍기3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = "*";
		for(int i = N; i > 0; i-- ) {
			for(int j = 0; j < i; j++) System.out.print(s);
			System.out.println();
		}
	}
	
}
