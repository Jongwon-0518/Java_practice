package java_practices.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class util1 {	
	
	void array() throws NumberFormatException, IOException, ArrayIndexOutOfBoundsException {
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 100;
		do {
			String Num[] = bf1.readLine().split(" ");
			sum = Integer.parseInt(Num[0])+Integer.parseInt(Num[1]);
			if(sum==0) {
				break;
			}
			bw.write(sum+"\n");
			} while(sum != 0);
		bw.flush();
		bw.close();
	}
}


public class ex1 {
	
	public static void main(String[] args) throws NumberFormatException, ArrayIndexOutOfBoundsException, IOException {
		util1 u1 = new util1();
		u1.array();
	}

}
