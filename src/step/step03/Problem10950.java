package step.step03;

import java.util.Scanner;

public class Problem10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}
