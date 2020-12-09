package Abstraction;

abstract class bank {	
	
	abstract void getBalance();

}

class bankA extends bank {
	void getBalance() {
		System.out.print("Balance Deposited Bank A: 100 " );
		
	}
	
}	
class bankB extends bank {
	void getBalance() {
		System.out.print("Balance Deposited Bank B: 150 " );
	}

}	
class bankC extends bank {
	void getBalance() {
		System.out.print("Balance Deposited Bank C: 200 " );	
	}

}

public class Exercise4 {
	
	public static void main(String[] args) {
		bankA a = new bankA();
		bankB b = new bankB();
		bankC c = new bankC();
		
		a.getBalance();
		b.getBalance();
		c.getBalance();
		
	}

}
	

