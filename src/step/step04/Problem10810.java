package step.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10810 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st;
			String line = br.readLine();
			if (line != null) {
				st = new StringTokenizer(line);
				if (st.countTokens() == 2) {
					int N = Integer.parseInt(st.nextToken());
					int M = Integer.parseInt(st.nextToken());
					
					int[] buckets = new int[N];
					for (int m = 0; m < M; m++) {
						line = br.readLine();
						if (line != null) {
							st = new StringTokenizer(line);
							if (st.countTokens() == 3) {
								int i = Integer.parseInt(st.nextToken()) - 1;
								int j = Integer.parseInt(st.nextToken()) - 1;
								int k = Integer.parseInt(st.nextToken());
								
								while (i <= j) {
									buckets[i] = k;
									i++;
								}
							}
						}
					}
					
					for (int ball : buckets) {
						bw.write(Integer.toString(ball) + " ");
						bw.flush();
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
