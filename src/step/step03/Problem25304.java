package step.step03;

import java.util.Scanner;

public class Problem25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int cnt = sc.nextInt();
		
		int newTot = 0;
		for (int i = 0; i < cnt; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			newTot += (a * b);
		}
		
		if (tot == newTot) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
