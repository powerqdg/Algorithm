package step.step01;

import java.util.Scanner;

public class Problem2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		int sum = 0;
		for (int i = b.length() - 1; i > -1; i--) {
			int calRslt = a * Integer.parseInt(String.valueOf(b.charAt(i)));
			int powNum = (b.length() - 1) - i;
			sum += (calRslt * Math.pow(10, powNum));
			System.out.println(calRslt);
		}
		System.out.println(sum);
	}
}
