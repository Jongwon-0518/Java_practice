package java_practices.four;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String prob = sc.nextLine();
			String Num[] = prob.split(" ");
			int A = Integer.parseInt(Num[0]);
			int B = Integer.parseInt(Num[1]);
			System.out.println(A+B);
		}
		sc.close();
	}

}
