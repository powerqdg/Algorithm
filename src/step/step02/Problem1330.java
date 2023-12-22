package step.step02;

import java.util.Scanner;

public class Problem1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		} else {
			throw new Error("오류가 발생했습니다. 입력을 확인하세요.");
		}
	}
}
