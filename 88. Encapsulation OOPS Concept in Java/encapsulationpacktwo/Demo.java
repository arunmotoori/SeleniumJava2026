package encapsulationpacktwo;

public class Demo {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println(c.getCompany());
		System.out.println(c.getWheels());
		c.setCompany("Kia");
		c.setWheels(8);
		System.out.println(c.getCompany());
		System.out.println(c.getWheels());
		
	}

}
