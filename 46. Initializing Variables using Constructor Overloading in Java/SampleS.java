package packagec;

public class SampleS {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.displayDetails();
		
		Student s2 = new Student("Praveen");
		
		s2.displayDetails();
		
		Student s3 = new Student("Kishore",24);
		
		s3.displayDetails();
		
		Student s4 = new Student("Mahesh",19,65);
		
		s4.displayDetails();
		
	}

}
