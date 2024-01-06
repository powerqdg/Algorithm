package step.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2869 {
	private BufferedReader reader;
	private BufferedWriter writer;
	
	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	private void solve() {
		try {
			String line = reader.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			// 	  DAY1		DAY2			  DAY3
			// 낮: A		,	A - B + A		, A - B + A - B + A
			// 밤: A - B	,	A - B + A - B	, A - B + A - B + A - B
			// 낮 일반화 => A + (A - B) * (N - 1)
			
			// 낮 일반화한 것이 V이상인 경우가 최소 걸리는 일수
			// A + (A - B) * (N - 1) >= V
			// (A - B) * (N - 1) >= V - A
			// N - 1 >= (V - A) / (A - B)
			// N >= (V - A) / (A - B) + 1
			// N >= (V - A + A - B) / (A - B)
			// N >= (V - B) / (A - B)
			
			// 낮이 V이상인 일수 계산
			int day = (V - B) / (A - B);
			
			// 나머지가 있다면 밤에 내려오고, 낮에 올라가야 하므로 하루가 더 소진됨
			int remainder = (V - B) % (A - B);
			if (remainder != 0) {
				day++;
			}
			
			writer.write(Integer.toString(day));
			writer.flush();
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
		Problem2869 solution = new Problem2869();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
