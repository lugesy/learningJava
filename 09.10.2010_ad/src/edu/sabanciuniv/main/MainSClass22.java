package edu.sabanciuniv.main;
import edu.sabanciuniv.objects.Student;


public class MainSClass22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String software = "Software Eng";
		String physics = "Physics";
		String math = "Math";
		String turkish = "Turkish";
		String it = "IT";
		
	
		
		Student s1 = new Student();
		
		s1.name="altug";
		
		Student s2 = s1;
		
		s2.name="mehmet";
		
		Student s3 = new Student();
		
		s3=s1;
		
		s1.name="haydar";
		
		
		
		System.out.println();

	}

}
