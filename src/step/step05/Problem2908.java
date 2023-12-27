package step.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2908 {
	private static String reverseString(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = null;
			String line = null;
			while ((line = br.readLine()) != null) {
				st = new StringTokenizer(line);
				String a = st.nextToken();
				String b = st.nextToken();
				
				
				int _a = Integer.parseInt(reverseString(a));
				int _b = Integer.parseInt(reverseString(b));
				
				if (_a > _b) {
					bw.write(Integer.toString(_a));
				} else {
					bw.write(Integer.toString(_b));
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
