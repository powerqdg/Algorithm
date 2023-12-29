package step.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10798 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[][] matrix = new String[5][15];
			for (int i = 0; i < matrix.length; i++) {
				String[] row = matrix[i];
				String line = br.readLine();
				int lineLen = line.length();
				for (int j = 0; j < row.length; j++) {
					if (j < lineLen) {
						matrix[i][j] = String.valueOf(line.charAt(j));
					} else {
						break;
					}
				}
			}
			
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					String item = matrix[j][i];
					if (item != null) {
						bw.write(item);
					}
				}
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
