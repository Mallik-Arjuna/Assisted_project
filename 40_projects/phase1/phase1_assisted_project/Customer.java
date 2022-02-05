package bank;

public abstract class Customer {
	String customerID;
	String customerName;
	String customerType;
	Customer(String custID,String custName,String custType){
		this.customerID=custID;
		this.customerName=custName;
		this.customerType=custType;
	}
	void showCustomerDetails()
	{
		System.out.println("customer ID:"+this.customerID);
		System.out.println("customer Name:"+this.customerName);
		System.out.println("customer Type:"+this.customerType);

	}
	abstract double get_final_amount(double interest,int year);

	}


