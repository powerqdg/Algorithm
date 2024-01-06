package step.step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem2501 {
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
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					list.add(i);
				}
			}
			
			if (list.size() > b - 1) {
				writer.write(Integer.toString(list.get(b - 1)));
			} else {
				writer.write(Integer.toString(0));
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
		Problem2501 solution = new Problem2501();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
