package step.step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem19532 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int len = st.countTokens();
			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int a = arr[0];
			int b = arr[1];
			int c = arr[2];
			int d = arr[3];
			int e = arr[4];
			int f = arr[5];
			
			int x = (c * e - b * f) / (a * e - b * d);
			int y = (c * d - a * f) / (b * d - a * e);
			
			writer.append(Integer.toString(x));
			writer.append(" ");
			writer.append(Integer.toString(y));
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
		Problem19532 solution = new Problem19532();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
