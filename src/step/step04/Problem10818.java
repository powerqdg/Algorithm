package step.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10818 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st;
			String line = null;
			int lineNum = 0;
			int arrLen = 0;
			int[] intArr = null;
			while ((line = br.readLine()) != null) {
				lineNum++;
				st = new StringTokenizer(line);
				
				if (!st.hasMoreTokens()) {
					break;
				}
				
				if (lineNum == 1) {
					arrLen = Integer.parseInt(st.nextToken());
				} else if (lineNum == 2) {
					intArr = new int[arrLen];
					for (int i = 0; i < intArr.length; i++) {
						intArr[i] = Integer.parseInt(st.nextToken());
					}
					
					int min = 1000000;
					int max = 1;
					
					for (int i : intArr) {
						min = Math.min(min, i);
						max = Math.max(max, i);
					}
					bw.write(Integer.toString(min) + " " + Integer.toString(max));
					bw.flush();
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
