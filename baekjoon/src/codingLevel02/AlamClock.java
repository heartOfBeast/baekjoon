package codingLevel02;

import java.util.Scanner;

public class AlamClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		sc.close();
		H = H%24;
		M = M%60 -45;

		if(M<0) {
			M = 60+M;
			H = H-1;
			if(H<0) {
				H = 24+H;
			}
		}
		
		System.out.println(H+" "+M);
		
	}
}
