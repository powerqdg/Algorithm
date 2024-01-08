package step.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1085 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			int diffX = w - x;
			int diffY = h - y;

			int minDistanceX = Math.min(x, diffX);
			int minDistanceY = Math.min(y, diffY);

			int result = Math.min(minDistanceX, minDistanceY);

			writer.write(Integer.toString(result));
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
			if (reader != null) {
				writer.close();
			}
		} catch (IOException e) {
			handleIOException(e);
		}
	}

	public static void main(String[] args) {
		Problem1085 solution = new Problem1085();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
