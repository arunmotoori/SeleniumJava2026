package interfacepack;

public interface InterfaceE {
	
	double MIN_VALUE = 5.5;
	String ACCOUNT_TYPE_ONE = "Savings";
	
	public void depositMoney();
	public void withdrawMoney();
	
}

class ClassM implements InterfaceE {

	@Override
	public void depositMoney() {
		System.out.println("deposit Money");
	}

	@Override
	public void withdrawMoney() {
		System.out.println("withdraw Money");
	}
	
	public void sampleChild() {
		System.out.println("sampleChild");
	}
	
}

