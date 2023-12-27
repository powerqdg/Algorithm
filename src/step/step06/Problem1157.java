package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1157 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String words = br.readLine().toUpperCase();
			Map<String, Integer> alphabets = new HashMap<String, Integer>();
			for (int i = 0; i < words.length(); i++) {
				String key = String.valueOf(words.charAt(i));
				if (alphabets.containsKey(key)) {
					int value = alphabets.get(key);
					alphabets.put(key, ++value);
				} else {
					alphabets.put(key, 1);
				}
			}
			
			int max = Integer.MIN_VALUE;
			for (int a : alphabets.values()) {
				max = Math.max(max, a);
			}
			
			List<String> maxKeys = new ArrayList<String>();
			for (String key : alphabets.keySet()) {
				int value = alphabets.get(key);
				if (value == max) maxKeys.add(key);
			}
			
			String result = "";
			if (maxKeys.size() > 1) {
				result = "?";
			} else {
				result = maxKeys.get(0);
			}
			
			bw.write(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}


