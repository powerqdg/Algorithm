package step.step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5086 {
	private BufferedReader reader;
	private BufferedWriter writer;
	
	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	private void solve() {
		try {
			while (true) {
				String line = reader.readLine();
				StringTokenizer st = new StringTokenizer(line);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if (a == 0 && b == 0) {
					break;
				}
				
				if (a % b == 0) {
					writer.write("multiple");
				} else if (b % a == 0) {
					writer.write("factor");
				} else {
					writer.write("neither");
				}
				writer.newLine();
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
			if (writer != null) {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Problem5086 solution = new Problem5086();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
