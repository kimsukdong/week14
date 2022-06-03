package week14;
import java.io.*;
import java.util.*;

public class Test6{
	public static void main(String[] args) {
		int cnt =0;
		try {
			FileReader fr = new FileReader("c:/wk/student.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileOutputStream fs = new FileOutputStream("c:/wk/student1.txt");		
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			String num;
			int grade;
			String name;
			String tel_number;			
			Student stu;

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				StringTokenizer st = new StringTokenizer(line);
				cnt++;
				while(st.hasMoreTokens()) {
					num = st.nextToken();
					grade = Integer.parseInt(st.nextToken());
					name = st.nextToken();
					tel_number = st.nextToken();
					stu = new Student(num, grade, name, tel_number);
					os.writeObject(stu);
				}
			}
			fr.close();
			os.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("학생 객체는 총  "+ cnt +"개 생성됨.");
		}

	}
}
