package java_practices.one;

import java.util.Scanner;

class calculator {
	void sum(int left, int right) {
		System.out.println(left+right);
	}
}

public class ex5 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		calculator s1 = new calculator();
		int left = sc.nextInt();
		int right = sc.nextInt();
		s1.sum(left, right);
		sc.close();
	}   

}