package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem3003 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] numArr = {1, 1, 2, 2, 2, 8};
			int[] result = new int[numArr.length];
			String line = null;
			StringTokenizer st;
			while ((line = br.readLine()) != null && !"".equals(line)) {
				st = new StringTokenizer(line);
				for (int i = 0; i < numArr.length; i++) {
					int num = numArr[i];
					result[i] = num - Integer.parseInt(st.nextToken());
				}
			}
			
			for (int a : result) {
				bw.write(Integer.toString(a) + " ");
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
