package step.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2587 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			String line = null;
			List<Integer> list = new ArrayList<Integer>();
			while ((line = reader.readLine()) != null) {
				if ("".equals(line)) break;
				list.add(Integer.parseInt(line));
			}
			
			Collections.sort(list);
			
			int sum = 0;
			for (int number : list) {
				sum += number;
			}
			int avg = sum / list.size();
			int mid = list.get(2);
			writer.append(Integer.toString(avg));
			writer.newLine();
			writer.append(Integer.toString(mid));
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
		Problem2587 solution = new Problem2587();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
