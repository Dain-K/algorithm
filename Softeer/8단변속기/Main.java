import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] num = new int[8];
        for(int i = 0; i < 8; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // ascending 인지 아닌지
        int temp = num[0];
        boolean isAscending = true;
        for(int i = 1; i < 8; i++) {
            if(temp + 1 == num[i]){
                temp = num[i];
            } else {
                isAscending = false;
                break;
            }
        }

        // descending 인지 아닌지
        temp = num[0];
        boolean isDescending = true;
        for(int i = 1; i < 8; i++) {
            if(temp - 1 == num[i]){
                temp = num[i];
            } else {
                isDescending = false;
                break;
            }
        }

        if(isAscending == true) System.out.println("ascending");
        else if(isDescending == true) System.out.println("descending");
        else System.out.println("mixed");
    }
}