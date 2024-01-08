package step.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10101 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			int angle1 = Integer.parseInt(reader.readLine());
			int angle2 = Integer.parseInt(reader.readLine());
			int angle3 = Integer.parseInt(reader.readLine());
			int sum = angle1 + angle2 + angle3;

			if (sum != 180) {
				writer.write("Error");
			} else if (angle1 == angle2 && angle2 == angle3) {
				writer.write("Equilateral");
			} else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
				writer.write("Isosceles");
			} else {
				writer.write("Scalene");
			}
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
		Problem10101 solution = new Problem10101();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
