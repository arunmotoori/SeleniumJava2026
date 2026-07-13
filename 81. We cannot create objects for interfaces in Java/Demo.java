package interfacepack;

public class Demo {

	public static void main(String[] args) {
		
		//InterfaceE i = new InterfaceE();
		//InterfaceE i; //This is possible
		
		ClassM c = new ClassM();
		System.out.println(InterfaceE.MIN_VALUE);
		System.out.println(InterfaceE.ACCOUNT_TYPE_ONE);
		c.depositMoney();
		c.withdrawMoney();
		c.sampleChild();
		
		InterfaceE i = new ClassM();
		System.out.println(InterfaceE.MIN_VALUE);
		System.out.println(InterfaceE.ACCOUNT_TYPE_ONE);
		i.depositMoney();
		i.withdrawMoney();
		//i.sampleChild();

	}

}




