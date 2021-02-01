package java_practices.one;

import java.util.Scanner;

class calculator5 {
	int A;
	int B;
	
	void mult() {
		int C = A*((B%100)%10);
		int D = A*(B%100-((B%100)%10))/10;
		int E = A*(B/100);
		int result = A*B;
		System.out.println(C + "\n" + D + "\n" + E + "\n" + result);
	}
}
public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculator5 c1 = new calculator5();
		c1.A = sc.nextInt();
		c1.B = sc.nextInt();
		sc.close();
		c1.mult();
	}

}
