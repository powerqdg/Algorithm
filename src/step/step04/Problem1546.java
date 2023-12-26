package step.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1546 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st;
			String line = null;
			
			int lineNum = 0;
			int N = 0;
			int[] buckets = new int[0];
			while ((line = br.readLine()) != null) {
				lineNum++;
				st = new StringTokenizer(line);
				
				if (lineNum == 1) {
					N = Integer.parseInt(st.nextToken());
					buckets = new int[N];
					continue;
				}
				
				int cnt = st.countTokens();
				for (int i = 0; i < cnt; i++) {
					buckets[i] = Integer.parseInt(st.nextToken());
				}
				
				int max = 0;
				for (int score : buckets) {
					max = Math.max(max, score);
				}
				
				float sum = 0;
				for (int i = 0; i < N; i++) {
					float tmp = (float) buckets[i] / max * 100; 
					sum += tmp;
				}
				
				float avg = sum / N;
				bw.write(Float.toString(avg));
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
