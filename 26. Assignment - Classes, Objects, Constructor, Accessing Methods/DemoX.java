
class Student {
	
	int id;
	String name;
	double marks;
	
	public Student(int id,String name,double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void study() {
		System.out.println(name+" is studying");
	}
	
	public void eat() {
		System.out.println(name+" is eating");
	}
	
	public void sleep() {
		System.out.println(name+" is sleeping");
	}
	
	public void studentDetails() {
		System.out.println("Id of the student is "+id);
		System.out.println("Name of the student is "+name);
		System.out.println("Marks of the student are "+marks);
	}

}

public class DemoX {
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"Arun",95.23);
		s1.study();
		s1.eat();
		s1.sleep();
		s1.studentDetails();
		Student s2 = new Student(2,"Varun",83.45);
		s2.study();
		s2.eat();
		s2.sleep();
		s2.studentDetails();
	}
	
}




