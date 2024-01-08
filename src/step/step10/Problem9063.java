package step.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem9063 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			int n = Integer.parseInt(reader.readLine());
			int[] x = new int[n];
			int[] y = new int[n];
			
			StringTokenizer st;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(reader.readLine());
				x[i] = Integer.parseInt(st.nextToken());
				y[i] = Integer.parseInt(st.nextToken());
			}
			
			int minX = Integer.MAX_VALUE;
			int maxX = Integer.MIN_VALUE;
			for (int i = 0; i < x.length; i++) {
				minX = Math.min(minX, x[i]);
				maxX = Math.max(maxX, x[i]);
			}
			int minY = Integer.MAX_VALUE;
			int maxY = Integer.MIN_VALUE;
			for (int i = 0; i < y.length; i++) {
				minY = Math.min(minY, y[i]);
				maxY = Math.max(maxY, y[i]);
			}
			
			int area = (maxX - minX) * (maxY - minY);
			writer.write(Integer.toString(area));
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
		Problem9063 solution = new Problem9063();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
