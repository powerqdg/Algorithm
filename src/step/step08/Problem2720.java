package step.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2720 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] coins = {25, 10, 5, 1};
			String line = br.readLine();
			int lineCnt = 0;
			if (line != null) {
				lineCnt = Integer.parseInt(line);
				for (int i = 0; i < lineCnt; i++) {
					int cent = Integer.parseInt(br.readLine());
					for (int j = 0; j < coins.length; j++) {
						int coin = coins[j];
						String mok = Integer.toString(cent / coin);
						cent = cent % coin;
						if (j != coins.length - 1) {
							mok += " ";
						}
						bw.write(mok);
					}
					bw.newLine();
				}
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
