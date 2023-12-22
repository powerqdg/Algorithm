package step.step02;

import java.util.Scanner;

public class Problem2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int hour = a;
		int minutes = b - 45;
		if (minutes < 0) {
			minutes += 60;
			if (hour == 0) {
				hour = 23;
			} else {
				hour -= 1;
			}
		}
		
		System.out.println(hour + " " + minutes);
	}
}
