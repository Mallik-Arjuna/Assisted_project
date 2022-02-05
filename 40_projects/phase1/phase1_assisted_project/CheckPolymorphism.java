package polymorphism.house;

public class CheckPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HouseArchitecture ha;
ha=new villas();
System.out.println("Average price of villas are:"+String.format("%.0f",ha.getPrice()));
System.out.println("Bank who can provide loans are:"+ha.getLoanBank());
ha=new farmhouse();
System.out.println("Average price of farmhouse are:"+String.format("%.0f",ha.getPrice()));
System.out.println("Bank who can provide loans are:"+ha.getLoanBank());
ha=new apartment();
System.out.println("Average price of Apartment are:"+String.format("%.0f",ha.getPrice()));
System.out.println("Bank who can provide loans are:"+ha.getLoanBank());
}

}
