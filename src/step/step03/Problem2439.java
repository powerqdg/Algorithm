package step.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			int starCnt = i + 1;
			int spaceCnt = cnt - starCnt;
			
			String rslt = "";
			for (int j = 0; j < spaceCnt; j++) {
				rslt += " ";
			}
			for (int j = 0; j < starCnt; j++) {
				rslt += "*";
			}
			bw.write(rslt + "\n");
		}
		br.close();
		bw.close();
	}
}
