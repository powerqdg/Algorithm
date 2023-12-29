package step.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2566 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = null;
			int[][] matrix = new int[9][9];
			int max = 0;
			
			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 9; j++) {
					int num = Integer.parseInt(st.nextToken());
					matrix[i][j] = num;
					max = Math.max(max, num);
				}
			}
			
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (max == matrix[i][j]) {
						bw.write(Integer.toString(max));
						bw.newLine();
						bw.write(Integer.toString(i + 1) + " " + Integer.toString(j + 1));
						return;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
