package step.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2675 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int testCnt = Integer.parseInt(br.readLine());
			StringTokenizer st = null;
			for (int i = 0; i < testCnt; i++) {
				st = new StringTokenizer(br.readLine());
				int repeatNum = Integer.parseInt(st.nextToken());
				String word = st.nextToken();
				for (int j = 0; j < word.length(); j++) {
					for (int k = 0; k < repeatNum; k++) {
						bw.write(String.valueOf(word.charAt(j)));
					}
				}
				bw.newLine();
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
