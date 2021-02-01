package java_practices.two;

import java.util.Scanner;

class util {
	int A;
	int B;
	
	void comparison() {
		if(A>B) {
			System.out.println(">");
		} else {
			if (A==B) {
				System.out.println("==");
			} else {
				System.out.println("<");
			}
		}
	}
}

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		util u1 = new util();
		u1.A = sc.nextInt();
		u1.B = sc.nextInt();
		sc.close();
		u1.comparison();
	}

}
