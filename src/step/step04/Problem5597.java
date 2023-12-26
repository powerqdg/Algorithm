package step.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5597 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int STUDENT_COUNT = 30;
			int[] studentArr = new int[STUDENT_COUNT];
			
			StringTokenizer st;
			String line = null;
			while ((line = br.readLine()) != null) {
				st = new StringTokenizer(line);
				int idx = Integer.parseInt(st.nextToken()) - 1;
				studentArr[idx] = 1;
			}
			
			for (int i = 0; i < studentArr.length; i++) {
				if (studentArr[i] == 0) {
					bw.write(Integer.toString(i + 1) + "\n");
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
