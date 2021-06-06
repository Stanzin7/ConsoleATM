package atm;

public class Account {
	private String _customerName;
	private int _id;
	private double _balance;
	private double _annualInterestRate;
	
	public Account() {}
	
	public Account(int id, String name) {
		this._id = id;
		this._customerName = name;
		_annualInterestRate = 5;
	}

	//getters and setters

	public String getCustomerName() {
		return _customerName;
	}

	public void setCustomerName(String _customerName) {
		this._customerName = _customerName;
	}

	public int getId() {
		return _id;
	}

	public void setId(int _id) {
		this._id = _id;
	}

	public double getBalance() {
		return _balance;
	}

	public void setBalance(double _balance) {
		this._balance = _balance;
	}

	public double getAnnualInterestRate() {
		return _annualInterestRate;
	}

	public void setAnnualInterestRate(double _annualInterestRate) {
		this._annualInterestRate = _annualInterestRate;
	}
	
	//Methods 
	public double deposit(double amount) {
		return this._balance = this._balance + amount;
	}
	
	public double withdraw(double amount) {
		double newAmount = 0;
		if(this._balance> amount) {
			newAmount = this._balance -= amount;
		}		
		
		return newAmount;
	}
	
	public double monthlyInterest() {
		double newInterest;
		newInterest = this._balance * ((this._annualInterestRate/12)/100);
		return newInterest;
	}

	
	
	
	//End of Account class
}
