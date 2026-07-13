package interfacepack;

public interface InterfaceC {
	
	String ACCOUNT_TYPE_ONE = "Savings";
	
	public void depositMoney();

}

class ClassOne implements InterfaceC {

	@Override
	public void depositMoney() {
		System.out.println("Deposit Money");
	}
	
}

