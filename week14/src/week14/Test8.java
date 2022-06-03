package week14;
import java.io.*;
import java.util.*;

public class Test8{
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/wk/student1.txt"));		
		Student student=null;
		String[] str = new String[100];
		String o_grade = "1";
		int cnt=0,lcnt=0;;
		try {
			while ((student= (Student)ois.readObject())!= null) {
				str[cnt++] = student.grade + " "+student.num + " "+student.name + " "+student.tel_number;
			}
			ois.close();
		} catch (EOFException e) {
			System.out.println(o_grade+"학년");
		}

		String[] str_a = new String[cnt];

		System.arraycopy(str, 0, str_a,0,cnt);
		Arrays.parallelSort(str_a);

		for(int i =0; i<cnt;i++) {
			StringTokenizer st = new StringTokenizer(str_a[i], " ");
			while(st.hasMoreTokens()) {
				String grade = st.nextToken();
				String num = st.nextToken();
				String name = st.nextToken();
				String tel_number = st.nextToken();
				if(o_grade.equals(grade)) {
					System.out.println(num + "\t " +grade + "\t " + name + "\t "+ tel_number);
					lcnt++;
				}
				else {
					System.out.println("총 "+ lcnt + " 명");
					System.out.println("\n"+grade+"학년");
					System.out.println(num + "\t " +grade + "\t " + name + "\t "+ tel_number);
					lcnt=1;
				}
				o_grade = grade;
			}

		}
		System.out.println("총 "+ lcnt + " 명");
	}
}
