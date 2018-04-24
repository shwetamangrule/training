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
	
	public void display() {
		System.out.println("enter a phone number");
		String pn = sc.next();
		addPhone(pn);
	}
	
	public void addPhone(String pn) {
		PhoneNumber phoneNo=new PhoneNumber();
		phoneNo.setPhoneNumber(pn);
		phone.add(phoneNo);
	}
	
	public void addMobile(String mn) {
		PhoneNumber mobileNo=new PhoneNumber();
		System.out.println("enter a mobile address");
		mn = sc.next();
		mobileNo.setPhoneNumber(sc.next());
		mobile.add(mobileNo);
	}

	public void addEmail() {
		Email mail=new Email();
		System.out.println("enter a email address");
		mail.setEmail(sc.next());
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
