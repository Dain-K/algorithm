import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int approved = 0;
        int rejected = 0;
        int invalid = 0;
        for(int i = 0; i < N; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	
        	if(num == 1) approved++;
        	else if(num == -1)rejected++;
        	else invalid++;
        }
        if((approved + rejected <= invalid)) System.out.println("INVALID");
        else if(approved > rejected) System.out.println("APPROVED");
        else System.out.println("REJECTED");
	}
}

