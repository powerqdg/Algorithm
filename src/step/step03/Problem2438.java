package step.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2438 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		String star = "";
		for (int i = 0; i < cnt; i++) {
			star += "*";
			bw.write(star + "\n");
		}
		br.close();
		bw.close();
	}
}
