package step.step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2798 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int cardCount = Integer.parseInt(st.nextToken());
			int goalNumber = Integer.parseInt(st.nextToken());
			int[] numArr = new int[cardCount];
			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < cardCount; i++) {
				numArr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(numArr);
			
			int max = Integer.MIN_VALUE;
			for (int i = cardCount - 1; i > -1; i--) {
				for (int j = i - 1; j > -1; j--) {
					for (int k = 0; k < j; k++) {
						int sum = numArr[i] + numArr[j] + numArr[k];
						if (sum <= goalNumber) {
							max = Math.max(max, sum);
						}
					}
				}
			}
			writer.write(Integer.toString(max));
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
		Problem2798 solution = new Problem2798();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
