package training.bankingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {

	List <PhoneNumber> mobile=new ArrayList<PhoneNumber>();
	List <PhoneNumber> phone=new ArrayList<PhoneNumber>();
	List <Email> email=new ArrayList<Email>();
	
	Bank bank=new Bank();
	Scanner sc=new Scanner(System.in);
	
	public void addPhone() {
		PhoneNumber phoneNo=new PhoneNumber();
		System.out.println("enter a phone number");
		phoneNo.setPhoneNumber(sc.nextInt());
		phone.add(phoneNo);
	}
	
	public void addMobile() {
		PhoneNumber mobileNo=new PhoneNumber();
		System.out.println("enter a mobile address");
		mobileNo.setPhoneNumber(sc.nextInt());
		mobile.add(mobileNo);
	}

	public void addEmail() {
		Email mail=new Email();
		System.out.println("enter a email address");
		mail.setEmail(sc.next());
		email.add(mail);
	}
	
	
	
	
}
