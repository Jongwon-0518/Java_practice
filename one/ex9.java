package java_practices.one;
import java.util.Scanner;

class calculator3 {
	int left, right;
	
	void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	void one() {
		System.out.println(left+right);
	}
	
	void two() {
		System.out.println(left-right);
	}
	
	void three() {
		System.out.println(left*right);
	}
	
	void four() {
		System.out.println(left/right);
	}
	
	void five() {
		System.out.println(left%right);
	}
}

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculator3 c1 = new calculator3();
		c1.left = sc.nextInt();
		c1.right = sc.nextInt();
		sc.close();
		c1.one();
		c1.two();
		c1.three();
		c1.four();
		c1.five();
		
	}

}
