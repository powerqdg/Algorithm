package step.step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1018 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			boolean[][] board = new boolean[w][h];
			
			for (int i = 0; i < w; i++) {
				String line = reader.readLine();
				String[] lineArr = line.split("");
				for (int j = 0; j < lineArr.length; j++) {
					boolean isWhite = "W".equals(lineArr[j]) ? true : false;
					board[i][j] = isWhite;
				}
			}
			
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if (i + 8 == w || j + 8 == h) {
						break;
					}
					
					System.out.printf("limit-i: %d, limit-j: %d", i + 8, j + 8);
					System.out.println();
					
					boolean prev = false;
					int cnt = 0;
					
					for (int m = i + 0; m < i + 8; m++) {
						for (int n = j + 0; n < j + 8; n++) {
							if (m == 0 && n == 0) {
								prev = board[i][j];
								continue;
							}
							
							boolean curr = board[m][n];
							if (n == 0) {
								if (curr != prev) {
									cnt++;
								}
							} else {
								if (curr == prev) {
									cnt++;
									prev = !curr;
									continue;
								}
							}
							prev = curr;
						}
						// System.out.println(cnt);
					}
					min = Math.min(min, cnt);
				}
			}
			writer.write(Integer.toString(min));
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
		Problem1018 solution = new Problem1018();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
