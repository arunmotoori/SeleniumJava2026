package packagek;

public class ClassX {

	public static void main(String[] args) {
		
		Students s = new Students(9,"Yogesh");
		s.display();
		
	}

}

class Students {
	
	int id;
	String name;
	
	public Students() {
		id = 1;
		name = "Rakesh";
	}
	
	public Students(int id) {
		this.id = id;
		name = "Sukumar";
	}
	
	public Students(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id+" - "+name);
	}
	
	
}