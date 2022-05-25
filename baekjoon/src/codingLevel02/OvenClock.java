package codingLevel02;

import java.util.Scanner;

public class OvenClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		B=B+C;

		if((B)/60>0) {
			A=(A+B/60)%24;
			B=B%60;
		}
		
		System.out.println(A+" "+B);

	}
}
