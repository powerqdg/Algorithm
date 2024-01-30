package step.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem25305 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			String line = reader.readLine();
			String[] items = line.split(" ");
			// int cnt = Integer.parseInt(items[0]);
			int limit = Integer.parseInt(items[1]); 
			
			StringTokenizer st = new StringTokenizer(reader.readLine());
			List<Integer> list = new ArrayList<Integer>();
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(list, Collections.reverseOrder());
			
			writer.append(Integer.toString(list.get(limit - 1)));
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
		Problem25305 solution = new Problem25305();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
