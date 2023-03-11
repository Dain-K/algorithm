import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1076_저항 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		for(int i = 0; i < 2; i++) {
			String s = br.readLine();
			if(s.equals("black")) result += "0";
			else if(s.equals("brown")) result += "1";
			else if(s.equals("red")) result += "2";
			else if(s.equals("orange")) result += "3";
			else if(s.equals("yellow")) result += "4";
			else if(s.equals("green")) result += "5";
			else if(s.equals("blue")) result += "6";
			else if(s.equals("violet")) result += "7";
			else if(s.equals("grey")) result += "8";
			else if(s.equals("white")) result += "9";
		}
		
		String s = br.readLine();
		long output = Integer.parseInt(result);
		if(s.equals("black")) output *= 1;
		else if(s.equals("brown")) output *= 10;
		else if(s.equals("red")) output *= 100;
		else if(s.equals("orange")) output *= 1000;
		else if(s.equals("yellow")) output *= 10000;
		else if(s.equals("green")) output *= 100000;
		else if(s.equals("blue")) output *= 1000000;
		else if(s.equals("violet")) output *= 10000000;
		else if(s.equals("grey")) output *= 100000000;
		else if(s.equals("white")) output *= 1000000000;
		
		System.out.println(output);

	}

}
