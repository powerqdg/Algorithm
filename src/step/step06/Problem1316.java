package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1316 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int lineNum = 0;
			int resultCnt = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				lineNum++;
				
				if (lineNum == 1) {
					continue;
				}
				
				String prev = "";
				boolean isValid = true;
				for (int i = 0; i < line.length(); i++) {
					String a = String.valueOf(line.charAt(i));
					int aIdx = line.indexOf(a);
					if (!"".equals(prev) && !prev.equals(a) && i != aIdx) {
						isValid = false;
						break;
					}
					prev = a;
				}
				
				if (isValid) {
					resultCnt++;
				}
			}
			
			bw.write(Integer.toString(resultCnt));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
