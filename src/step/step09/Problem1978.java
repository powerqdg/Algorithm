package step.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1978 {
	private BufferedReader reader;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	private boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private void solve() {
		try {
			int n = Integer.parseInt(reader.readLine());
			StringTokenizer st = new StringTokenizer(reader.readLine());

			int cnt = 0;
			while (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				if (isPrime(num)) {
					cnt++;
				}
			}
			System.out.println(cnt);
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
		Problem1978 solution = new Problem1978();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
