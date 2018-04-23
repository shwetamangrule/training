package training.testing;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import collection.PhoneBookBean;

public class Controller {

	static Scanner sc=new Scanner(System.in);
	List<PhoneBookBean> phone  = new ArrayList<PhoneBookBean>();	

	public void addPerson()
	{	

		PhoneBookBean phonebook=new PhoneBookBean();

		System.out.println("Enter The ID Of The Person");
		String personId=sc.next();
		phonebook.setPersonId(personId);

		System.out.println("Enter The Name Of The Person");
		String username=sc.next();
		phonebook.setName(username);
		


		System.out.println("Enter The Address Of The Person");
		String address=	sc.next();
		phonebook.setAddress(address);


		System.out.println("Enter The Mobile Number Of The Person");
		String phoneNumber=sc.next();
		phonebook.setPhoneNo( phoneNumber);


		System.out.println("Congratulations You Just Entered Details:" +"presonID "+phonebook.getPersonId()
		+ phonebook.getName()+"Address :  "+phonebook.getAddress()
		+" "+" has the number"+phonebook.getPhoneNo());


		phone.add(phonebook);

	}
	public void showAllPerson()
	{
		for(PhoneBookBean entity:phone)
		{
			System.out.println("User Index: "+phone.indexOf(entity));
			System.out.println("============================");
			System.out.println("User First Name"+ " "+entity.getPersonId());
			System.out.println("User First Name"+ " "+entity.getName());
			System.out.println("User Last Name"+" " +entity.getAddress());
			System.out.println("User Mobile Number"+" "+entity.getPhoneNo());
			System.out.println("============================");
		}
	}

	public void showPersonUsingPhone()
	{
		System.out.println("Enter The Number Of The User:");
		PhoneBookBean phonebook1=new PhoneBookBean();

		String finduser=sc.next();
		int count=0;
		int index2=-1;	
		for(PhoneBookBean entity:phone)
		{
			if(entity.getPhoneNo().equalsIgnoreCase(finduser))
			{count++;
			index2=phone.indexOf(entity);
			}
		}

		if (count!=0)
		{
			System.out.println("User Found");
			System.out.println(phone.get(index2));

		}
		else
		{
			System.out.println("No user found");
		}
	}
	public void removePerson()
	{
		System.out.println("Enter The Number Of The User:");
		PhoneBookBean phonebook2=new PhoneBookBean();
		int index=-1;
		String user=sc.next();
		for(PhoneBookBean entity:phone)
		{
			if(entity.getPhoneNo().equalsIgnoreCase(user))
			{
				index=phone.indexOf(entity);

			}
		}
		phone.remove(index);
	}
	public static void main(String args[])
	{
		Controller control=new Controller();


		while(true)
		{
			System.out.println("Enter The Choice");
			System.out.println("============================");
			System.out.println("1-Add a user");
			System.out.println("2-View all user");
			System.out.println("3-View by number");
			System.out.println("4-Delete a user");
			System.out.println("5-Exit");
			System.out.println("============================");

			int choice =sc.nextInt();

			switch(choice)
			{
			case 1:
				control.addPerson();
				break;

			case 2:
				control.showAllPerson();
				break;


			case 3:
				control.showPersonUsingPhone();
				break;


			case 4:
				control.removePerson();
				break;


			case 5:
				System.exit(0);
				break;


			}
		}
	}
}