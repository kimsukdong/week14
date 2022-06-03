package week14;
import java.io.*;
import java.util.*;

public class Test1{
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/wk/input.txt");
			BufferedReader br = new BufferedReader(fr);

			int[] list = new int[100];
			int cnt=0;
			String line;
			while ((line = br.readLine()) != null) {
				int value = Integer.parseInt(line);
				list[cnt++]=value;
			}
			fr.close();

			int[] list2 = new int[cnt];
			for(int i = 0; i<cnt;i++) {
				list2[i]=list[i];
			}
			Arrays.sort(list2);

			FileWriter fr1 = new FileWriter("c:/wk/output.txt");
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
