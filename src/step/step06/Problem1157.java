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
			
			// 대소문자 구분하지 않고 카운트 해야하니 대문자든지 소문자로 변경
			// 최종 대문자로 출력해야하니까  대문자로 변경함 
			String words = br.readLine().toUpperCase();
			
			// 키를 포함하면 카운트 하나 증가, 아니면 카운트 1로 새로 추가
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
			
			// 사용횟수 최대값 구하기
			int max = Integer.MIN_VALUE;
			for (int a : alphabets.values()) {
				max = Math.max(max, a);
			}
			
			// 최대값에 해당하는 키 값(알파벳) 찾기
			List<String> maxKeys = new ArrayList<String>();
			for (String key : alphabets.keySet()) {
				int value = alphabets.get(key);
				if (value == max) maxKeys.add(key);
			}

			// 가장 많이 사용된 알파벳이 여러 개인 경우 ?를 출력, 아니면 해당 문자를 대문자로 출력
			String result = (maxKeys.size() > 1) ? "?" : maxKeys.get(0);
			
			// 결과 출력
			bw.write(result);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}


