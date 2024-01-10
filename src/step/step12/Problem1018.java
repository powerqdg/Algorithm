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
					boolean isWhite;
					if ("W".equals(lineArr[j])) {
						isWhite = true;
					} else {
						isWhite = false;
					}
					board[i][j] = isWhite;
				}
			}
			
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < w; i++) {
				int iMax = i + 7;
				if (iMax >= w) {
					break;
				}
				for (int j = 0; j < h; j++) {
					int jMax = j + 7;
					if (jMax >= h) {
						break;
					}
					
					boolean prev = board[i][j];
					int cnt = 0;
					for (int m = i; m <= iMax; m++) {
						for (int n = j; n <= jMax; n++) {
							if (m == i && n == j) continue;
							
							boolean curr = board[m][n];
							
							if (prev == curr) {
								cnt++;
								prev = !curr;
							} else {
								prev = curr;
							}
						}
						prev = !prev;
					}
					cnt = Math.min(cnt, 64 - cnt);
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
