package java_practices.three;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Array[] = new int [N];
		for(int i=0; i<N; i++) {
			Array[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			if(Array[i]<X) {
				System.out.print(Array[i] + " ");
			}
		}
		
	}

}
