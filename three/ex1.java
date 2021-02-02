package java_practices.three;

import java.util.Scanner;

class util1 {
	int N;
	
	void multiple() {
		for(int i=1; i<10; i++) {
			int result = i*N;
			System.out.println(N + " * " + i + " = " + result);
		}
	}
}


public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		util1 u1 = new util1();
		u1.N = sc.nextInt();
		sc.close();
		u1.multiple();
	}

}
