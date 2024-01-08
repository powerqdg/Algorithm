package step.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem3009 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			int[] x = new int[3];
			int[] y = new int[3];

			for (int i = 0; i < 3; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				x[i] = Integer.parseInt(st.nextToken());
				y[i] = Integer.parseInt(st.nextToken());
			}

			int[] countX = new int[1001];
			int[] countY = new int[1001];

			for (int i = 0; i < 3; i++) {
				countX[x[i]]++;
				countY[y[i]]++;
			}

			int resultX = findOddCountCoordinate(countX);
			int resultY = findOddCountCoordinate(countY);

			writer.append(Integer.toString(resultX));
			writer.append(" ");
			writer.append(Integer.toString(resultY));
			writer.flush();
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	private static int findOddCountCoordinate(int[] countArray) {
		for (int i = 1; i < countArray.length; i++) {
			if (countArray[i] % 2 == 1) {
				return i;
			}
		}
		return -1;
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
			if (reader != null) {
				writer.close();
			}
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	public static void main(String[] args) {
		Problem3009 solution = new Problem3009();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
