package step.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem14215 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int[] sides = {a, b, c};
			Arrays.sort(sides);
			
			while (sides[0] + sides[1] <= sides[2]) {
				sides[2]--; 
			}
			
			int largestPerimeter = sides[0] + sides[1] + sides[2];
			writer.write(Integer.toString(largestPerimeter));
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
		Problem14215 solution = new Problem14215();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
