package java_practices.two;

import java.util.Scanner;

class util2 {
	int A;
	
	void Score() {
		if(A<60) {
			System.out.println("F");
		} else {
			if(A<70) {
				System.out.println("D");
			} else {
				if(A<80) {
					System.out.println("C");
				} else {
					if(A<90) {
						System.out.println("B");
					} else {
						System.out.println("A");
					}
				}
			}
		}
	}
}

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		util2 u2 = new util2();
		u2.A = sc.nextInt();
		sc.close();
		u2.Score();
	}

}
