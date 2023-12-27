package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10988 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			int i = 0;
			int j = line.length() - 1;
			boolean isPalindrome = true;
			while (i < j) {
				char a = line.charAt(i);
				char b = line.charAt(j);
				
				if (a != b) {
					isPalindrome = false;
					break;
				}
				
				i++;
				j--;
			}
			
			if (isPalindrome) {
				bw.write("1");
			} else {
				bw.write("0");
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


