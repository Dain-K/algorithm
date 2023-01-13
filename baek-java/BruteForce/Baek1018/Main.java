package BruteForce.Baek1018;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		
		String board[] = new String[row];
		
		for(int i = 0; i < row; i++) {
			board[i] = br.readLine();
		}
		
		int result = Integer.MAX_VALUE;
		
		for(int i = 0; i <= row - 8; i++) {
			for(int j = 0; j <= col - 8; j++) {
				int temp = solved(i, j, board);
				
				if(result > temp) // ���� ���� ���� ������ ����
					result = temp;
				
			}
		}	
		System.out.println(result);
	}
	
	public static int solved(int row, int col, String[] board) {
		String cBoard[] = {"WBWBWBWB", "BWBWBWBW"}; // �� ����
		
		int cnt = 0;
		for(int i = 0; i < 8; i++) {
			int c_row = row + i;
			for(int j = 0; j < 8; j++) {
				int c_col = col + j;
				
				if(board[c_row].charAt(c_col) != cBoard[c_row % 2].charAt(j)) {
					cnt++;
				}
					
			}
		}
			
		return Math.min(cnt, 64 - cnt);
		
	}

}
