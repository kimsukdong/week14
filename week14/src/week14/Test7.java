package week14;
import java.io.*;

public class Test7{
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/wk/student1.txt"));		
		Student student=null;
		int cnt = 0;
		try {
			while ((student= (Student)ois.readObject())!= null) {
				if(student.grade ==2) {
					System.out.println(student.num + "\t " + student.grade + "\t " + student.name + "\t "+ student.tel_number);
					cnt++;
				}
			}
			ois.close();
		} catch (EOFException e) {
			System.out.println(" ");
			 System.out.println("총 : " + cnt +" 명");
			// TODO Auto-generated catch block
			// System.err.println(e);
		}
	}
}