package step.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem27323 {
	private BufferedReader reader;

	private void initializeReader() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	private void solve() {
		try {
			int A = Integer.parseInt(reader.readLine());
			int B = Integer.parseInt(reader.readLine());
			int area = A * B;
			System.out.println(area);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void handleIOException(IOException e) {
		System.err.println("An error occurred while reading input: " + e.getMessage());
		e.printStackTrace();
	}

	private void closeReader() {
		try {
			if (reader != null) {
				reader.close();
			}
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	public static void main(String[] args) {
		Problem27323 solution = new Problem27323();
		solution.initializeReader();
		solution.solve();
		solution.closeReader();
	}
}
