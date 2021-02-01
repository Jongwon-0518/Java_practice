package java_practices.two;

import java.util.Scanner;

class util4 {
	int X, Y;
	
	void quadrant() {
		if(X>0) {
			if (Y>0) {
				System.out.println("1");
			} else {
				if(Y<0) {
					System.out.println("4");
				} else {
					System.out.println("line");
				}
			}
		} else {
			if (X<0) {
				if(Y>0) {
					System.out.println("2");
				} else {
					if(Y<0) {
						System.out.println("3");
					} else {
						System.out.println("line");
					}
				}
			} else {
				System.out.println("line");
			}
		}
	}
}

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		util4 u4 = new util4();
		u4.X = sc.nextInt();
		u4.Y = sc.nextInt();
		sc.close();
		u4.quadrant();
	}

}
