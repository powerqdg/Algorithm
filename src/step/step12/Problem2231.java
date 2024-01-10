package step.step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2231 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String strN = st.nextToken();
			int strNLen = strN.length();
			int N = Integer.parseInt(strN);
			int rslt = 0;
			for (int i = (N - (strNLen * 9)); i < N; i++) {
				int number = i;
				int sum = 0;
				
				while (number != 0) {
					sum += number % 10;
					number /= 10;
				}
				
				if (sum + i == N) {
					rslt = i;
					break;
				}
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
		Problem2231 solution = new Problem2231();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
