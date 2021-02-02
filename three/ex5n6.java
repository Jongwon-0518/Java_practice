package java_practices.three;

import java.util.Scanner;

public class ex5n6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i=1; i<N+1; i++) {
			System.out.println(N+1-i);
		}
	}

}
