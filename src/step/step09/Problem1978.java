package step.step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem1978 {
	private BufferedReader reader;
	private BufferedWriter writer;
	
	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	private void solve() {
		List<Integer> list = new ArrayList<Integer>();
		try {
			String line = reader.readLine();
			line = reader.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int cnt = 0;
			while (st.hasMoreTokens()) {
				int n = Integer.parseInt(st.nextToken());
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						list.add(i);
					}
				}
				
				if (list.size() == 2 && list.get(list.size() - 1) == n) {
					cnt++;
				}
				list.clear();
			}
			writer.write(Integer.toString(cnt));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void closeReaderWriter() {
		try {
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Problem1978 solution = new Problem1978();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
