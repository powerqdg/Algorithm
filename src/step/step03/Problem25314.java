package step.step03;

import java.util.Scanner;

public class Problem25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int longCnt = a / 4;
		String rslt = "";
		for (int i = 0; i < longCnt; i++) {
			rslt += "long ";
		}
		rslt += "int";
		
		System.out.println(rslt);
	}
}
