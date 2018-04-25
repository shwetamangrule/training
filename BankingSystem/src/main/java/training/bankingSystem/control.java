package training.bankingSystem;

public class control {

	public static void main(String[] args) {
		
		CheckingAccount saveAcnt=new CheckingAccount();
		
//		Money money=new Money();
//		money.setMoney(0);
//		//int balance=500;
		//saveAcnt.deposit(600);
		int depositAmnt=saveAcnt.deposit(700);
		int balance=saveAcnt.getBalance();
		System.out.println(balance);
		System.out.println(depositAmnt);

	}

}
