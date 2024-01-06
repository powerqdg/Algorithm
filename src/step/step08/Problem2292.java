package step.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2292 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			if (line != null) {
				int n = Integer.parseInt(line);
				// 1 => 1
				// 2 ~ 7 => 6
				// 8 ~ 19 => 12
				// 20 ~ 37 => 18
				// 38 ~ 61 => 24
				int min = 1;
				int max = 1;
				boolean flag = true;
				int minPlusNum = 0;
				int maxPlusNum = 0;
				int idx = 0;
				while (flag) {
					if (n >= min && n <= max) {
						bw.write(Integer.toString(idx + 1));
						flag = false;
					} else {
						minPlusNum = idx * 6;
						maxPlusNum = (idx + 1) * 6;
						
						if (idx == 0) {
							minPlusNum += 1;
						}
						
						min += minPlusNum;
						max += maxPlusNum;
					}
					idx++;
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
