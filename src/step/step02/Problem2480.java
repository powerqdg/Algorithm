package step.step02;

import java.util.Scanner;

public class Problem2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int rslt = 0;
		if (a == b && a == c) {
			rslt = 10000 + a * 1000;
		} else if ((a == b && a != c)
				|| (a == c && a != b)) {
			rslt = 1000 + a * 100;
		} else if (b == c && b != a) {
			rslt = 1000 + b * 100;
		} else {
			int max = 0;
			if (a > b && a > c) {
				max = a;
			} else if (b > a && b > c) {
				max = b;
			} else if (c > a && c > b) {
				max = c;
			}
			rslt = max * 100;
		}
		
		System.out.println(rslt);
	}
}
