package Sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10817_세수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] N = new int[3];
		for(int i = 0; i < 3; i++) 
			N[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(N);
		System.out.println(N[1]);

	}
	
}

