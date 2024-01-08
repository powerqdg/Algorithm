package step.step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem24262 {
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
			int[] result = menOfPassion(n);
			
			writer.append(Integer.toString(result[0]));
			writer.newLine();
			writer.append(Integer.toString(result[1]));
			
			writer.flush();
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	public static int[] menOfPassion(int n) {
		// 코드1의 수행 횟수는 1회
		int count = 1;

		// 코드1의 수행 횟수를 다항식으로 나타냈을 때 최고차항의 차수는 0
		int degree = 0;

		return new int[] { count, degree };
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
		Problem24262 solution = new Problem24262();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
