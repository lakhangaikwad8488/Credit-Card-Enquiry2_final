package main.java.yaksha;

import java.util.Scanner;

public class Customer{
	private long mobileNo;
	 private String customerName, customerAddress, companyName;
	 // private String countryName;
	 private float monthlySalary;
	 private String countryName="India";
	public Customer(long mobileNo,String customerName, String customerAddress, String companyName,String countryName,float monthlySalary)
	 {
		this.mobileNo=mobileNo;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.companyName=companyName;
		this.countryName=countryName;
		this.monthlySalary=monthlySalary;
		 
	 }
	 
	 public Customer(long mobileNo,String customerName, String customerAddress, String companyName,float monthlySalary)
	 {  
		
		this.mobileNo=mobileNo;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.companyName=companyName;
		this.monthlySalary=monthlySalary;
		 
	 }
	public boolean display() {
		 
		 System.out.println("Mobile No:"+mobileNo);
		 System.out.println("Customer Name:"+customerName);
		 System.out.println("Customer address:"+customerAddress);
		 System.out.println("Company name:"+companyName);
		 System.out.println("Country name:"+countryName);
		 System.out.println("Monthly Salary:"+monthlySalary);
		 return true;
	 }

	 

	 
 }

