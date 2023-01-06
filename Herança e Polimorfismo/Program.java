package applications;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		

		
		
		
		
		
		
		//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//		
//		// UPCASTING // Convertendo uma SUBCLASSE para SUPERCLASSE
//		
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//		
//		// DOWNCASTING // Convertendo um objeto da SUPERCLASSE para a SUBCLASSE
//		
//		BusinessAccount acc4 = (BusinessAccount)acc2 ;
//		acc4.loan(100.0);
	}

}
