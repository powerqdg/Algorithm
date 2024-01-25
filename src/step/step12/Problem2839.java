package step.step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2839 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int rslt = 0;
			if (n == 4 || n == 7) {
				rslt = -1;
			}
			else if (n % 5 == 0) {
				rslt = (n / 5);
			}
			else if (n % 5 == 1 || n % 5 == 3) {
				rslt = (n / 5) + 1;
			}
			else if (n % 5 == 2 || n % 5 == 4) {
				rslt = (n / 5) + 2;
			}
			writer.write(Integer.toString(rslt));
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
		Problem2839 solution = new Problem2839();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
