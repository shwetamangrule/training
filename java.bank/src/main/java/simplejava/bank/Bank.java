package simplejava.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	List <String> bank=new ArrayList<String>();
	Contact contact=new Contact();

	public List<String> getBank()
	{
		return bank;
	}
	public void setBank(List<String> bank) 
	{
		this.bank = bank;
	}

}