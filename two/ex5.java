package java_practices.two;

import java.util.Scanner;

class util5 {
	int H, M;
	
	void alarm() {
		int A = H-1;
		int B = H+23;
		int C = M-45;
		int D = M+15;
		
		if(0<H) {
			if(H<24) {
				if(M>44) {
					if(M<60) {
						System.out.println(H + " " + C);
					} else {
						System.out.println("Error");
					}
				} else {
					if(M<0) {
						System.out.println("Error");
					} else {
						System.out.println(A + " " + D);
					}
				}
			} else {
				System.out.println("Error");
			}
		} else {
			if(H==0) {
				if(M>44) {
					if(M<60) {
						System.out.println(H + " " + C);

					} else {
						System.out.println("Error");
					}
				} else {
					if(M<0) {
						System.out.println("Error");
					} else {
						System.out.println(B + " " + D);
					}
				}
			} else {
				System.out.println("Error");
			}
		}
	}
}
public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		util5 u5 = new util5();
		u5.H = sc.nextInt();
		u5.M = sc.nextInt();
		sc.close();
		u5.alarm();
	}

}
