import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        int maxLength = 0;
        for(int i = 0; i < 5; i++) {
        	arr[i] = br.readLine();
        	if(maxLength < arr[i].length()) maxLength = arr[i].length();
        }

    	for(int i = 0; i < maxLength; i++) {
    		for(int j = 0; j < 5; j++) {
    			if(arr[j] != null) {
    				System.out.print(arr[j].charAt(i));
    				if(arr[j].length() - 1 == i) arr[j] = null;
    			}
    		}
    	}
    }
    
}