package week14;
import java.io.*;
import java.util.*;

public class Test2{
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/wk/input2.txt");
			BufferedReader br = new BufferedReader(fr);

			double[] list = new double[100];
			int cnt=0;
			String line;
			while ((line = br.readLine()) != null) {
				double value = Double.parseDouble(line);
				list[cnt++]=value;
			}
			fr.close();

			double[] list2 = new double[cnt];
			for(int i = 0; i<cnt;i++) {
				list2[i]=list[i];
			}
			Arrays.sort(list2);

			FileWriter fr1 = new FileWriter("c:/wk/output2.txt");
			BufferedWriter br1 = new BufferedWriter(fr1);

			for (int k = 0; k < cnt; k++) {
				br1.write((k+1) +" : " +list2[k]);
				br1.newLine();
			}
			br1.flush(); //buffer에 남아있는 자료를 파일로 보냄
			fr1.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
