package java_practices.two;

import java.util.Scanner;

class util3 {
	int A;
	
	void year() {
		if(A%4==0) {
			if(A%400==0) {
				System.out.println("1");
			} else {
				if(A%100==0) {
					System.out.println("0");
				} else {
					System.out.println("1");
				}
			}
		} else {
			System.out.println("0");
		}
		
	}
}

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		util3 u3 = new util3();
		u3.A = sc.nextInt();
		sc.close();
		u3.year();
	}

}
