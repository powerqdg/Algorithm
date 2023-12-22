package step.step02;

import java.util.Scanner;

public class Problem2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour, minutes, addMinutes;
		hour = sc.nextInt();
		minutes = sc.nextInt();
		addMinutes = sc.nextInt();
		
		int totMin = minutes + addMinutes;
		if (totMin >= 60) {
			minutes = (totMin % 60);
			hour += (totMin / 60);
			if (hour > 23) {
				hour = hour % 24;
			}
		} else {
			minutes = totMin;
		}
		
		System.out.printf("%d %d", hour, minutes);
	}
}
