import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()); // DNA 문자열 길이
		int p = Integer.parseInt(st.nextToken()); // 비밀번호 문자열 길이
		char[] dna = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		int[] ACGT = new int[4];
		int[] compareACGT = new int[4];
		for(int i = 0; i < 4; i++) ACGT[i] = Integer.parseInt(st.nextToken());
		int result = 0;
		
		for(int i = 0; i < p; i++) {
			if(dna[i] == 'A') compareACGT[0]++;
			if(dna[i] == 'C') compareACGT[1]++;
			if(dna[i] == 'G') compareACGT[2]++;
		    if(dna[i] == 'T') compareACGT[3]++;
		}
		
		int start =0;
		int end = p;
		
		while(true) {	
			if(compareACGT[0] >= ACGT[0] && compareACGT[1] >= ACGT[1] && compareACGT[2] >= ACGT[2] && compareACGT[3] >= ACGT[3])
				result++;
			if(end == s) break;
			
			if(dna[start] == 'A') compareACGT[0]--;
			if(dna[start] == 'C') compareACGT[1]--;
			if(dna[start] == 'G') compareACGT[2]--;
			if(dna[start] == 'T') compareACGT[3]--;
			
			if(dna[end] == 'A') compareACGT[0]++;
			if(dna[end] == 'C') compareACGT[1]++;
			if(dna[end] == 'G') compareACGT[2]++;
			if(dna[end] == 'T') compareACGT[3]++;
			
			//System.out.println(compareACGT[0] + " " + compareACGT[1] + " " + compareACGT[2] + " " + compareACGT[3] + " ");
			
			
			start++;
			end++;
		}
		System.out.println(result);
	
	}
}
