package main.java.yaksha;
import main.java.yaksha.Customer;

import java.util.Scanner;

public class CustomerMain {
	
	public static void main(String[] args) {
		String country;
		 String countryName=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Mobile No:");
		long mobileNo=sc.nextLong();
			System.out.println("Enter Customer Name:");
		String customerName=sc.next();
		System.out.println("Enter Customer address");
		String customerAddress=sc.next();
		System.out.println("Enter the Company name:");
		String companyName=sc.next();
		 
		System.out.println("Whether the Customer is from India(Yes/No):");
		 country=sc.next();
		
		if(country.equals("Yes") || country.equals("yes") || country.equals("no") || country.equals("No"))
		{
			
		}else {
			System.out.println("Wrong Input");
			System.out.println("Whether the Customer is from India(Yes/No):");
			country=sc.next();
		}
		
		if(country.equals("no")||country.equals("No"))
		{
			System.out.println("Enter country name");
			  countryName=sc.next();
			
		}
	 
		System.out.println("Enter Monthly Salary:");
		float monthlySalary=sc.nextFloat();
		
		if(country.equals("no")||country.equals("No"))
		{
			Customer c1=new Customer(mobileNo,customerName,customerAddress,companyName,countryName,monthlySalary);
			c1.display();
		}else {
		Customer c1=new Customer(mobileNo,customerName,customerAddress,companyName,monthlySalary);
		c1.display();
		}
		
	}

}

