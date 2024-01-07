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
		
		// 64를 예로 들어보자
		// 64의 약수는 1, 2, 4, 8, 16, 32, 64가 있다.
		// 1을 제외하고 2부터 64로 나누었을 때, 나머지가 0인지 확인해야 한다.
		// 나머지가 0이면 합성수, 아니면 소수
		// 근데 2, 4, 8, ... 64까지 모두 확인해야 하나?
		// 아니다 2, 4, 8까지만 확인하면 된다.
		// (2) * 32 = 64, (4) * 16 = 64, (8) * 8 = 64, (16) * 4 = 64, (32) * 2 = 64
		// 위 내용을 보면 (8)이후로는 숫자의 앞뒤 순서만 바뀌지 똑같은 식이다.
		// (16) * 4 = 64  => (4) * 16 = 64
		// (32) * 2 = 64  => (2) * 32 = 64
		// 그러므로 (8)까지만 확인하면 된다. (8)은 64의 제곱근이다.
		// 즉, 8을 i라 했을 때, i * i가 num보다 작은 경우까지만 확인하면 (16), (32)를 확인할 필요가 없어 효율적이 된다. 
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
