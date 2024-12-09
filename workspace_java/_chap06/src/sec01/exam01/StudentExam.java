package sec01.exam01;

//int a = 9;

public class StudentExam {

	
	
	public static void main(String[] args) {

		Student s1 = new Student();
		
		Student s2 = new Student();
		
		System.out.println(s1 == s2);	// false
		
		Student s3 = null;
		s3 = s1;
		System.out.println(s1 == s3);	// true
		
		s2 = null;
	}

}
