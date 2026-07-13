package interfacepack;

public interface Bank {
	
	public void openAccount();
	public void depositMoney();
	public void transferMoney();
	
	default void withdrawMoney() {
		System.out.println("Money withdrawn from Bank");
	}

}

class HDFC implements Bank {

	@Override
	public void openAccount() {
		System.out.println("Account opended in HDFC Bank");		
	}

	@Override
	public void depositMoney() {
		System.out.println("Money deposited into HDFC Bank");
	}

	@Override
	public void transferMoney() {
		System.out.println("Money transferred from HDFC Bank");
	}
	
	@Override
	public void withdrawMoney() {
		System.out.println("Money withdrawn from HDFC Bank");
	}
	
}

class ICICI implements Bank {

	@Override
	public void openAccount() {
		System.out.println("Account opened in ICICI Bank");
	}

	@Override
	public void depositMoney() {
		System.out.println("Money deposited in ICICI Bank");
	}

	@Override
	public void transferMoney() {
		System.out.println("Money transferred from ICICI Bank");
	}
	
}

class SBI implements Bank {

	@Override
	public void openAccount() {
		System.out.println("Account opended in SBI Bank");
	}

	@Override
	public void depositMoney() {
		System.out.println("Money deposited in SBI Bank");
	}

	@Override
	public void transferMoney() {
		System.out.println("Money transferred from SBI Bank");
	}
	
}

class AXIS implements Bank {

	@Override
	public void openAccount() {
		System.out.println("Account opened in AXIS Bank");
	}

	@Override
	public void depositMoney() {
		System.out.println("Money deposited into AXIS Bank");
	}

	@Override
	public void transferMoney() {
		System.out.println("Money transferred from AXIS Bank");
	}
	

}
