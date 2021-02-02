package java_practices.three;

import java.util.Scanner;

public class ex9n10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int a=1; a<N+1; a++) {
			for(int c=0; c<N-a; c++) {
				System.out.print(" ");
			}
			for(int b=0; b<a; b++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
