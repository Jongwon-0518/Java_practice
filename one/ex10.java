package java_practices.one;

import java.util.Scanner;

class calculator4{
	int A, B, C;
	
	void setOprands(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	void one() {
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
}

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculator4 c1 = new calculator4();
		c1.A = sc.nextInt();
		c1.B = sc.nextInt();
		c1.C = sc.nextInt();
		sc.close();
		c1.one();
		
	}

}
