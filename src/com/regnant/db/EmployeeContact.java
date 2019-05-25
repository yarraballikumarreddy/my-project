package com.regnant.db;

public class EmployeeContact 
{
	public String homenumber; 
	public String address; 
	public String city; 
	public String state; 
	public String country; 
	public String pincode;
	@Override
	public String toString() {
		return "EmployeeContact [homenumber=" + homenumber + ", address=" + address + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + "]";
	} 
}
