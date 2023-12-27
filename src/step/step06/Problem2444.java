package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2444 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			int N = Integer.parseInt(line);
			int lineCnt = 2 * N - 1;
			int a = N - 1;
			int b = N - 1;
			
			for (int i = 0; i < lineCnt; i++) {
				for (int j = 0; j < lineCnt; j++) {
					if (j < a) {
						bw.append(" ");
					} else if (j >= a && j <= b) {
						bw.append("*");
						
					}
				}
				if (i < lineCnt) {
					bw.newLine();
				}
				
				if (i < N - 1) {
					a--;
					b++;
				} else {
					a++;
					b--;
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


