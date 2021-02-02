package java_practices.three;

import java.util.Scanner;

class util2 {
	Scanner sc = new Scanner(System.in);
	
	int T;
	int intArray[][];
	
	void array() {
		T = sc.nextInt();
		intArray = new int [T][];
		
		for(int i=0; i<T; i++) {
			intArray[i] = new int [3];
		}
	}
	
	void scan() {
		for(int i=0; i<T; i++) {
			intArray[i][0] = sc.nextInt();
			intArray[i][1] = sc.nextInt();
			intArray[i][2] = intArray[i][0] + intArray[i][1];
		}
		sc.close();
	}
	
	void show() {
		for(int i=0; i<T; i++) {
			System.out.println(intArray[i][2]);
		}
	}
}

public class ex2 {
	
	public static void main(String[] args) {
		util2 u2 = new util2();
		u2.array();
		u2.scan();
		u2.show();
	}

}
