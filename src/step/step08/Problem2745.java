package step.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2745 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			if (line == null) {
				throw new Exception("유효하지 않은 입력값입니다.");
			}
			
			StringTokenizer st = new StringTokenizer(line);
			String N = st.nextToken();
			String B = st.nextToken();
			
			int sum = 0;
			int nLen = N.length();
			for (int i = nLen - 1; i > -1 ; i--) {
				char n = N.charAt(i);
				int num = Character.getNumericValue(n);
				int index = (nLen - 1) - i;
				sum += num * Math.pow(Double.parseDouble(B), index);
			}
			bw.write(Integer.toString(sum));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
