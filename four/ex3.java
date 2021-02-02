package java_practices.four;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int i = 1;
		int A = N/10;
		int B = N%10;
		int C = A+B;
		int D = (B*10)+(C%10);
		
		while(N != D) {
			A=D/10;
			B=D%10;
			C=A+B;
			D = (B*10)+(C%10);
			i++;
		} 
		System.out.println(i);
	}

}
