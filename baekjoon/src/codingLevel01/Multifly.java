package codingLevel01;

import java.util.Scanner;

public class Multifly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String number = String.valueOf(B);
		String[] arrNumber = number.split("(?<=.)");
		sc.close();
		
		for(int i = arrNumber.length-1; i>=0; i--) {
			System.out.println(A*Integer.parseInt(arrNumber[i]));
		}
		
		System.out.println(A*B);
		
	}
}
