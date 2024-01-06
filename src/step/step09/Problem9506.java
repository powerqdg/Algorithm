package step.step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem9506 {
	private BufferedReader reader;
	private BufferedWriter writer;
	
	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	private void solve() {
		List<Integer> list = new ArrayList<Integer>();
		try {
			while (true) {
				String line = reader.readLine();
				int n = Integer.parseInt(line);
				if (n == -1) {
					break;
				}
				
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						list.add(i);
					}
				}
				
				int sum = 0;
				for (int i = 0; i < list.size() - 1; i++) {
					sum += list.get(i);
				}
				
				if (sum == n) {
					writer.append(n + " = ");
					for (int i = 0; i < list.size() - 1; i++) {
						writer.append(Integer.toString(list.get(i)));
						if (i != list.size() - 2) {
							writer.append(" + ");
						}
					}
				} else {
					writer.append(n + " is NOT perfect.");
				}
				writer.newLine();
				list.clear();
			}
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
		Problem9506 solution = new Problem9506();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
