package Exercice1;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStdName("Kiran");
		System.out.println("Student's Name : " + student.getStdName());
		student.setStdRollNo(4);
		System.out.println("Student's Roll no : " + student.getStdRollNo());
		student.setStdId(12345);
		System.out.println("Student's Id : " + student.getStdId());
		

	}

}
