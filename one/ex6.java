package java_practices.one;

import java.util.Scanner;

class calculator2 {
	void mul(double left, double right) {
		double result = left/right;
		System.out.println(result);
	}
}

public class ex6 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		calculator2 s1 = new calculator2();
		int left = sc.nextInt();
		int right = sc.nextInt();
		s1.mul(left, right);
		sc.close();
	}   

}