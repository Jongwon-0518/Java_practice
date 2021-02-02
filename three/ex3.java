package java_practices.three;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=0; i<n+1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
