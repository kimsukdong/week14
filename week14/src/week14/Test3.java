package week14;
import java.io.*;
import java.util.*;

public class Test3{
	public static void main(String[] args) {
		try {
			FileReader fr1 = new FileReader("c:/wk/output.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			FileReader fr2 = new FileReader("c:/wk/output2.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			FileWriter fr3 = new FileWriter("c:/wk/output3.txt");
			BufferedWriter br3 = new BufferedWriter(fr3);
			
			while (true) {
				String line = br1.readLine();
				if (line == null)
					break;
				br3.write(line);
				br3.newLine();
			}
			while (true) {
				String line = br2.readLine();
				if (line == null)
					break;
				br3.write(line);
				br3.newLine();
			}
			br3.flush();
			fr1.close();
			fr2.close();
			fr3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
