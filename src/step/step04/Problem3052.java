package step.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem3052 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			HashSet<Integer> intArr = new HashSet<Integer>(10);
			
			StringTokenizer st;
			String line = null;
			while ((line = br.readLine()) != null) {
				st = new StringTokenizer(line);
				int num = Integer.parseInt(st.nextToken());
				intArr.add(new Integer(num % 42));
			}
			
			bw.write(Integer.toString(intArr.size()));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
