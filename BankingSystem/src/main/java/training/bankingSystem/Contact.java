package training.bankingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {

	List <PhoneNumber> mobile=new ArrayList<PhoneNumber>();
	List <PhoneNumber> phone=new ArrayList<PhoneNumber>();
	List <Email> email=new ArrayList<Email>();
	
	
	
	Scanner sc=new Scanner(System.in);
	

	public void Display()
	{
		System.out.println("enter a phone number");
		String PhNu=sc.next();
		System.out.println("enter a mobile address");
		String moNo=sc.next();
		System.out.println("enter a email address");
		String ml=sc.next();
		addPhone(PhNu);
		addMobile(moNo);
		addEmail(ml);
	}
	
	public void addPhone(String PhoneNumber) {
		PhoneNumber phoneNo=new PhoneNumber();
		phoneNo.setPhoneNumber(PhoneNumber);
		phone.add(phoneNo);
	}
	
	public void addMobile(String MobileNo) {
		PhoneNumber mobileNo=new PhoneNumber();
		mobileNo.setPhoneNumber(MobileNo);
		mobile.add(mobileNo);
	}

	public void addEmail(String maile) {
		Email mail=new Email();
		mail.setEmail(maile);
		email.add(mail);
	}
	
	public List<PhoneNumber> getMobile() {
		return mobile;
	}
	public List<PhoneNumber> getPhone() {
		return phone;
	}
	public List<Email> getEmail() {
		return email;
	}
}
