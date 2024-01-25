package step.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2750 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			List<Integer> list = new ArrayList<Integer>();
			
			int lineCnt = Integer.parseInt(reader.readLine());
			for (int i = 0; i < lineCnt; i++) {
				int num = Integer.parseInt(reader.readLine());
				if (!list.contains(num)) {
					list.add(num);
				}
			}
			
			Collections.sort(list);
			
			for (int i = 0; i < list.size(); i++) {
				writer.append(Integer.toString(list.get(i)));
				if (i < list.size()) {
					writer.newLine();
				}
			}
			writer.flush();
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	private void handleIOException(IOException e) {
		System.err.println("An error occurred while reading input: " + e.getMessage());
		e.printStackTrace();
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
			handleIOException(e);
		}
	}

	public static void main(String[] args) {
		Problem2750 solution = new Problem2750();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
