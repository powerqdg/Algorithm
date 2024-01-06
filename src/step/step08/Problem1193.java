package step.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1193 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			if (line != null) {
				boolean flag = false;
				int n = Integer.parseInt(line);
				int numerator = 1;
				int denominator = 1;
				for (int i = 1; i <= n; i++) {
					if (i == n) {
						String num = Integer.toString(numerator);
						String den = Integer.toString(denominator);
						bw.write(num + "/" + den);
						bw.flush();
						break;
					}
					
					if (numerator == 1 && flag == false) {
						flag = true;
						denominator++;
					} else if (denominator == 1 && flag == true) {
						flag = false;
						numerator++;
					} else {
						if (flag) {
							numerator++;
							denominator--;
						} else {
							numerator--;
							denominator++;
						}
					}
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
