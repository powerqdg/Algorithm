package step.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem5073 {
	private BufferedReader reader;
	private BufferedWriter writer;

	private void initializeReaderWriter() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	private void solve() {
		try {
			StringTokenizer st;
			String line = null;
			while ((line = reader.readLine()) != null) {
				st = new StringTokenizer(line);
				
				int[] nums = new int[3];
				nums[0] = Integer.parseInt(st.nextToken());
				nums[1] = Integer.parseInt(st.nextToken());
				nums[2] = Integer.parseInt(st.nextToken());
				
				if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
					break;
				}
				
				Arrays.sort(nums);
				
				if (nums[2] >= nums[0] + nums[1]) {
					writer.write("Invalid");
				} else if (nums[0] == nums[1] && nums[1] == nums[2]) {
					writer.write("Equilateral");
				} else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
					writer.write("Isosceles");
				} else {
					writer.write("Scalene");
				}
				writer.newLine();
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
		Problem5073 solution = new Problem5073();
		solution.initializeReaderWriter();
		solution.solve();
		solution.closeReaderWriter();
	}
}
