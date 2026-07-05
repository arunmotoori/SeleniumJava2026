package packagej;

public class ClassX {
	
	public static void main(String[] args) {
		
		Student s = new Student(5);
		s.displayDetails();
		
	}

}

class Student {
	
	int id;
	String name;
	
	public Student() {
//		id = 1;
//		name = "Kishore";
		//this(1);
		//this(1,"Kishore");
	}
	
	public Student(int id) {
//		this.id = id;
//		name = "Naveen";
		this(id,"Naveen");
		
	}
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println(id+" - "+name);
	}
	
}
