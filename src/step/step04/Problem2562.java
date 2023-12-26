package step.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem2562 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st;
			String line = null;
			ArrayList<Integer> inArr = new ArrayList<Integer>();
			while ((line = br.readLine()) != null) {
				st = new StringTokenizer(line);
				if (!st.hasMoreTokens()) {
					break;
				}
				inArr.add(Integer.parseInt(st.nextToken()));
			}
			
			int max = Integer.MIN_VALUE;
			for (Integer i : inArr) {
				max = Math.max(max, i);
			}
			
			int idx = inArr.indexOf(max);
			bw.write(Integer.toString(max));
			bw.newLine();
			bw.write(Integer.toString(idx  + 1));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
