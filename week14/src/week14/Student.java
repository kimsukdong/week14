package week14;
import java.io.Serializable;

class Student implements Serializable{
	String num;
	int grade;
	String name;
	String tel_number;
	
	public Student(String num, int grade, String name, String tel_number) {
		super();
		this.num = num;
		this.grade = grade;
		this.name = name;
		this.tel_number = tel_number;
	}
	
}
