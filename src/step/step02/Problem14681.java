package step.step02;

import java.util.Scanner;

public class Problem14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > 0 && b > 0) {
			System.out.println("1");
		} else if (a < 0 && b > 0) {
			System.out.println("2");
		} else if (a < 0 && b < 0) {
			System.out.println("3");
		} else if (a > 0 && b < 0) {
			System.out.println("4");
		} else {
			throw new Error("오류입니다. 입력값을 확인하세요.");
		}
	}
}
