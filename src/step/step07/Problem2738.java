package step.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2738 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = null;
			String line = br.readLine();
			if (line == null) {
				throw new Exception("유효하지 않은 입력입니다.");
			}
			
			st = new StringTokenizer(line);
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] matrix = new int[N][M];
			
			int i = 0;
			while ((line = br.readLine()) != null) {
				st = new StringTokenizer(line);
				
				for (int j = 0; j < M; j++) {
					matrix[i][j] += Integer.parseInt(st.nextToken());
				}
				
				i++;
				
				if (i == N) {
					i = 0;
				}
			}
			
			for (int[] row : matrix) {
				for (int col : row) {
					bw.write(Integer.toString(col) + " ");
				}
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
