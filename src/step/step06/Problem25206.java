package step.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25206 {
	private static float getPoint(String grade) {
		switch (grade) {
			case "A+":
				return 4.5F;
			case "A0":
				return 4.0F;
			case "B+":
				return 3.5F;
			case "B0":
				return 3.0F;
			case "C+":
				return 2.5F;
			case "C0":
				return 2.0F;
			case "D+":
				return 1.5F;
			case "D0":
				return 1.0F;
			case "F":
				return 0.0F;
		}
		return -999.0F;
	}
	
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = null;
			String line = null;
			float creditSum = 0.0F;
			float gradeSum = 0.0F;
			while ((line = br.readLine()) != null) {
				st = new StringTokenizer(line);
				
				// 입력
				String subject = st.nextToken();
				String credit = st.nextToken();
				String grade = st.nextToken();
				
				// 제한
				if (!(subject.length() >= 1 && 
					subject.length() <= 50)) {
					throw new Exception("유효하지 않은  과목명입니다.");
				}
				
				if (!("1.0".equals(credit) ||
					"2.0".equals(credit) ||
					"3.0".equals(credit) ||
					"4.0".equals(credit))) {
					throw new Exception("유효하지 않은 학점입니다.");
				}
				
				if (!("A+".equals(grade) || 
					"A0".equals(grade) ||
					"B+".equals(grade) || 
					"B0".equals(grade) ||
					"C+".equals(grade) || 
					"C0".equals(grade) ||
					"D+".equals(grade) || 
					"D0".equals(grade) ||
					"P".equals(grade) || 
					"F".equals(grade))) {
					throw new Exception("유효하지 않은 등급입니다.");
				}
				
				// 알고리즘
				if ("P".equals(grade)) {
					break;
				}
				
				creditSum += Float.parseFloat(credit);
				gradeSum += Float.parseFloat(credit) * getPoint(grade);
			}
			// 계산
			float GPA = gradeSum / creditSum;
			
			// 출력
			bw.write(Float.toString(GPA));
			bw.flush();
		} catch (Exception e) {
			String msg = e.getMessage();
			if (msg == null) {
				e.printStackTrace();
			} else {
				System.out.printf("오류: %s", msg);
			}
		} finally {
			try { if (br != null) br.close(); } catch (IOException e) {}
			try { if (bw != null) bw.close(); } catch (IOException e) {}
		}
	}
}
