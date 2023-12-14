import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args)
	{
		String firstname, lastname;
		int accNo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first and last names followed by account number of customer");

		firstname = sc.nextLine();
		lastname = sc.nextLine();
		accNo = Integer.parseInt(sc.nextLine());

		BankAccount b = new BankAccount(4500);
		b.setName(firstname,lastname);
		b.setAccNo(accNo);
		System.out.println(b.getName());
		System.out.println(b.getAccNo());

		System.out.println(b.getBalance());
		b.Deposit(500);
		System.out.println(b.getBalance());
		b.Withdraw(50);
		System.out.println(b.getBalance());
		b.Withdraw(500);
		System.out.println(b.getBalance());

		b.setLoanAmount(5000);
		System.out.println(b.getLoanAmount());
		System.out.println(b.isArmstrong());

		//System.out.println(b.first);
		/*This statement will raise an error
		 * as the "first" variable in BankAccount class is defined as
		 * private and it cannot be accessed in a public class,
		 * you can only view the details using getter methods you define*/
	}

}
