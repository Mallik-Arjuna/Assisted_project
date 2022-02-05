package bank;

public class bankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RegularCustomer regCustomer1=new RegularCustomer("R123","ruchi","domestic",10000);
RegularCustomer regCustomer2=new RegularCustomer("R456","suchi","business",60000);

EnterpriseCustomer entCustomer1=new EnterpriseCustomer("E123","ruchi","smallscale",40000);
EnterpriseCustomer entCustomer2=new EnterpriseCustomer("E456","ruchi","bigsale",50000);

regCustomer1.showCustomerDetails();
System.out.println("final amount:"+regCustomer1.get_final_amount(5,8));
regCustomer2.showCustomerDetails();
System.out.println("final amount:"+regCustomer2.get_final_amount(5,8));
entCustomer1.showCustomerDetails();
System.out.println("final amount:"+entCustomer1.get_final_amount(5,8));
entCustomer2.showCustomerDetails();
System.out.println("final amount:"+regCustomer2.get_final_amount(5,8));

	}

}
