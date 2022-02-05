package bank;

public class RegularCustomer extends Customer {
	String customerID;
	String customerName;
	String customerType;
	double amount;
	RegularCustomer(String custID,String custName,String custType,double amt){
		super(custID,custName,custType);
		
		this.customerID=custID;
		this.customerName=custName;
		this.customerType=custType;
		this.amount=amt;
	}
	double get_final_amount(double interest,int year)
	{
		double simple_interest=this.amount* interest*year;
		double amount=this.amount+simple_interest;
		if(this.customerType=="domestic") {
			return amount -500;
			}
		else if (this.customerType=="business") {
			return amount;
		}
return amount;
	}

}
