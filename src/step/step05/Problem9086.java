package step.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9086 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			int testCnt = Integer.parseInt(line);
			
			for (int i = 0; i < testCnt; i++) {
				String word = br.readLine();
				int lastIdx = word.length() - 1;
				String first = String.valueOf(word.charAt(0));
				String last = String.valueOf(word.charAt(lastIdx));
				bw.write(first + last + "\n");
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
