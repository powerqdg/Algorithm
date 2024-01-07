package step.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11653 {
	private BufferedReader reader;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	private void solve() {
		try {
			int N = Integer.parseInt(reader.readLine());
			if (N != 1) {
				for (int i = 2; i <= N; i++) {
					while (N % i == 0) {
						System.out.println(i);
						N /= i;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void closeReaderWriter() {
		try {
			if (reader != null) {
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Problem11653 solution = new Problem11653();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
