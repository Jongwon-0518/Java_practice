package java_practices.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class util7 {
	
	int T;
	
	
	void array() throws NumberFormatException, IOException {
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		T = Integer.parseInt(bf1.readLine());
		for(int i=0; i<T; i++) {
			String Num[] = bf1.readLine().split(" ");
			bw.write("Case #" + (i+1) + ": " + Num[0] + " + " + Num[1] + " = "+ (Integer.parseInt(Num[0])+Integer.parseInt(Num[1])) +"\n");
			}
		bw.flush();
		bw.close();
	}
}

public class ex7n8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		util7 u7 = new util7();
		u7.array();

	}

}
