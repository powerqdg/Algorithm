package step.step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem2581 {
	private BufferedReader reader;
	private BufferedWriter writer;
	
	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	private void solve() {
		List<Integer> rsltList = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		try {
			int M = Integer.parseInt(reader.readLine());
			int N = Integer.parseInt(reader.readLine());
			
			for (int i = M; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						list.add(j);
					}
				}
				
				if (list.size() == 2) {
					rsltList.add(i);
				}
				list.clear();
			}
			
			if (rsltList.size() > 0) {
				int sum = 0;
				for (int i = 0; i < rsltList.size(); i++) {
					sum += rsltList.get(i);
				}
				writer.write(Integer.toString(sum));
				writer.newLine();
				writer.write(Integer.toString(rsltList.get(0)));
			} else {
				writer.write("-1");
			}
			
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
		Problem2581 solution = new Problem2581();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
