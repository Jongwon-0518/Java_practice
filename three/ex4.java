package java_practices.three;

import java.io.*;

class util4 {
	
	int T;
	
	
	void array() throws NumberFormatException, IOException, ArrayIndexOutOfBoundsException {
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		T = Integer.parseInt(bf1.readLine());
		for(int i=0; i<T; i++) {
			String Num[] = bf1.readLine().split(" ");
			bw.write(Integer.parseInt(Num[0])+Integer.parseInt(Num[1])+"\n");
			}
		bw.flush();
		bw.close();
	}
}

public class ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException, ArrayIndexOutOfBoundsException {
		util4 u4 = new util4();
		u4.array();

	}

}
