import java.lang.Math;
import java.util.ArrayList;

public class BankAccount {

	private String first, last;
	public int accNo;
	private double balance, loanAmount, initialBalance = 0;
	public BankAccount()
	{

	}
	public BankAccount(double initialBalance)
	{
		this.initialBalance = initialBalance;
	}
	// Set Methods
	public void setName(String first, String last)
	{
		this.first = first;
		this.last = last;
	}
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	public void setBalance(double NewBalance){
		this.balance = NewBalance;
	}
	public void setLoanAmount(double newAmount){
		this.loanAmount = newAmount;
	}
	// Get Methods
	public String getName(){
		return this.first+" "+this.last;
	}
	public int getAccNo(){
		return this.accNo;
	}
	public double getBalance(){
		return this.balance;
	}
	public double getLoanAmount(){
		double totalAmountOwed = 0;
		totalAmountOwed = (this.loanAmount*3*.05)+this.loanAmount;
		return totalAmountOwed;
	}
	// Other Methods
	public void Deposit(double DepositAmt){
		this.balance = getBalance()+DepositAmt;
	}
	public double Withdraw(double WithdrawAmt){
		if(getBalance()-WithdrawAmt < 0){
			System.out.println("Unable to complete withdrawal, not enough funds.");
			return 0;
		}
		else{
			this.balance = getBalance()-WithdrawAmt;
			return WithdrawAmt;
		}
	}
	public boolean isArmstrong(){
		ArrayList<Integer> Busted = new ArrayList<Integer>();
		double sum = 0;
		String number = String.valueOf(this.getAccNo());
		System.out.println(number);
		for(int i=0; i<number.length(); i++){
			Busted.add(Integer.parseInt(String.valueOf(number.charAt(i))));
		}
		for (Integer num: Busted){
			sum += Math.pow(num,3);
		}
		if (sum == getAccNo()){
			return true;
		}
		else{
			return false;
		}

	}





}
