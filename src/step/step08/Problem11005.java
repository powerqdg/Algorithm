package step.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11005 {
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
			
			int n = Integer.parseInt(N);
			int b = Integer.parseInt(B);
			
			int quotient = 0;
			int remainder = 0;
			int tmp = n;
			String rslt = "";
			while (quotient > -1 ) {
				quotient = tmp / b;
				remainder = tmp % b;
				tmp = quotient;
				rslt = Integer.toString(remainder, b).toUpperCase() + rslt; 
				if (quotient == 0) {
					break;
				}
			}
			bw.write(rslt);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
