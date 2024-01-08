package step.step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem24313 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int a1 = Integer.parseInt(st.nextToken());
			int a0 = Integer.parseInt(st.nextToken());
			
			int c = Integer.parseInt(reader.readLine());
			int n0 = Integer.parseInt(reader.readLine());
			
			if (a1 * n0 + a0 <= c * n0 && c >= a1) {
				writer.write("1");
			} else {
				writer.write("0");
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
		Problem24313 solution = new Problem24313();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
