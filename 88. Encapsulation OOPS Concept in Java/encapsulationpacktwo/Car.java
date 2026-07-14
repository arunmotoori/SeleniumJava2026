package encapsulationpacktwo;

public class Car {
	
	private String company = "Honda";
	private int wheels = 4;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	

//	public void sample() {
//		System.out.println(company);
//		System.out.println(wheels);
//	}
//	
//	public void setCarDetails(String company,int wheels) {
//		this.company = company;
//		this.wheels = wheels;
//	}

}
