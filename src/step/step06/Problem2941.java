package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2941 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			if (line == null) {
				throw new Exception();
			}
			
			String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
			
			int totCnt = 0;
			boolean isNeedCheck = false;
			String temp = "";
			for (int i = 0; i < line.length(); i++) {
				String a = String.valueOf(line.charAt(i));
				temp += a;
				
				if ("c".equals(a) || "d".equals(a) || "l".equals(a) || "n".equals(a) || "s".equals(a) || "z".equals(a)) {
					isNeedCheck = true;
					if (i != line.length() - 1) {
						continue;
					}
				}
				
				if (isNeedCheck) {
					for (String b : arr) {
						if (temp.lastIndexOf(b) > -1) {
							temp = temp.replace(b, "");
							totCnt++;
							totCnt += temp.length();
							temp = "";
							isNeedCheck = false;
							break;
						}
					}
				}
				
				if (i == line.length() - 1) {
					totCnt += temp.length();
				}
			}
			
			bw.write(Integer.toString(totCnt));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
