package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1316 {
	private static String readLine(BufferedReader br) throws Exception {
		String result = br.readLine();
		if (result != null) {
			return result;
		}
		return "";
	}
	
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String line = br.readLine();
			if (line != null) {
				int lineCnt = Integer.parseInt(line);
				int result = 0;
				for (int i = 0; i < lineCnt; i++) {
					line = br.readLine();
					if (line != null) {
						String bfSpelling = "";
						List<String> spellingArr = new ArrayList<String>(Arrays.asList(line.split("")));
						boolean isGrpWord = true;
						for (int j = 0; j < spellingArr.size(); j++) {
							String spelling = spellingArr.get(j);
							
							if ("".equals(bfSpelling)) {
								bfSpelling = spelling;
								continue;
							}
							
							if (!"".equals(bfSpelling) && !bfSpelling.equals(spelling)) {
								int idx = spellingArr.indexOf(spelling);
								if (idx > -1 && idx < j) {
									isGrpWord = false;
									break;
								}
								bfSpelling = spelling;
								continue;
							}
						}
						
						if (isGrpWord) {
							result++;
						}
					}
				}
				bw.write(Integer.toString(result));
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}


