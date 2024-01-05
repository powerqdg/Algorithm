package step.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2563 {
	private static int CANVAS_WIDTH = 100;
	private static int CANVAS_HEIGHT = 100;
	private static int PAPER_WIDTH = 10;
	private static int PAPER_HEIGHT = 10;
	
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			if (line == null) {
				throw new Exception("빈 문자열이 입력되었습니다.");
			}
			
			boolean[][] canvas = new boolean[CANVAS_WIDTH][CANVAS_HEIGHT];
			
			StringTokenizer st = null;
			int lineCnt = Integer.parseInt(line);
			for (int i = 0; i < lineCnt; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				for (int j = x; j < x + PAPER_WIDTH; j++) {
					for (int k = y; k < y + PAPER_HEIGHT; k++) {
						canvas[j][k] = true;
					}
				}
			}
			
			int cnt = 0;
			for (int j = 0; j < CANVAS_WIDTH; j++) {
				for (int k = 0; k < CANVAS_HEIGHT; k++) {
					if (canvas[j][k]) cnt++;
				}
			}
			bw.write(Integer.toString(cnt));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
