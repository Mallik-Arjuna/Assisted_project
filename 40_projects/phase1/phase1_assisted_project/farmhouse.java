package polymorphism.house;

public class farmhouse extends HouseArchitecture{
	float getPrice()
	{
		return 100000000;
	}
	String getBankloan()
	{
		return"hdfc";
	}
	@Override
	String getLoanBank() {
		// TODO Auto-generated method stub
		return null;
	}
	}

