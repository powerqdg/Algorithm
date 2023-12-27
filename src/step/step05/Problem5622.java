package step.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5622 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String word = br.readLine();
			if (word != null && !"".equals(word)) {
				String[] dials = {null, null, "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
				
				int totSeconds = 0;
				for (char spelling : word.toCharArray()) {
					for (int i = 0; i < dials.length; i++) {
						String dial = dials[i];
						if (dial != null && dial.indexOf(String.valueOf(spelling)) > -1) {
							totSeconds += i; 
						}
					}
				}
				bw.write(Integer.toString(totSeconds));
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
