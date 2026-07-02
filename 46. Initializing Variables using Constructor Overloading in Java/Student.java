package packagec;

public class Student {
	
	String name;
	int age;
	double marks;
	

	public Student() {
		name = "Ravi";
		age = 25;
		marks = 98;
	}
	
	public Student(String name) {
		this.name = name;
		age = 22;
		marks = 94;
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		marks = 90;
	}
	
	public Student(String name,int age,double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void displayDetails() {
		System.out.println(name+" - "+age+" - "+marks);
	}
	
}

