package week14;
import java.io.*;
import java.util.*;

public class Test4{
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/wk/output3.txt");
			BufferedReader br = new BufferedReader(fr);
			String num, number;
			double dn;
			double[] list = new double[100];
			int cnt=0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				StringTokenizer st = new StringTokenizer(line, " : ");
				while(st.hasMoreTokens()) {
					num = st.nextToken();
					number = st.nextToken();
					dn=Double.parseDouble(number);
					list[cnt++]=dn;
				}
			}
			fr.close();
			double[] value = new double[cnt];
			System.arraycopy(list, 0, value, 0, cnt);
			Arrays.sort(value);

			FileWriter fr1 = new FileWriter("c:/wk/output4.txt");
			BufferedWriter br1 = new BufferedWriter(fr1);
			for (int k = 0; k < value.length; k++) {
				String bb = Double.toString(value[k]);
				br1.write((k+1) +" : " +bb);
				br1.newLine();
			}
			br1.flush();
			fr1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
