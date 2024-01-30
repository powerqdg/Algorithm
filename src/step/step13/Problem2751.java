package step.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Problem2751 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			Set<Integer> list = new HashSet<Integer>();
			
			String line = reader.readLine();
			int lineCnt = Integer.parseInt(line);
			for (int i = 0; i < lineCnt; i++) {
				list.add(Integer.parseInt(reader.readLine()));
			}
			
			int i = 0;
			for (int num : list) {
				writer.append(Integer.toString(num));
				if (i < list.size() - 1) {
					writer.newLine();
				}
				i++;
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
		Problem2751 solution = new Problem2751();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
