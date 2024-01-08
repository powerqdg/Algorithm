package step.step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem24264 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			long n = Integer.parseInt(st.nextToken());
			long[] result = menOfPassion(n);
			
			writer.append(Long.toString(result[0]));
			writer.newLine();
			writer.append(Long.toString(result[1]));
			
			writer.flush();
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	public static long[] menOfPassion(long n) {
		long count = n * n;
		long degree = 2;

		return new long[] { count, degree };
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
		Problem24264 solution = new Problem24264();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
