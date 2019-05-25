package com.regnant.db;

public class EmployeeProfessional 
{
	public String dateofjoining; 
	public String dateofrelieving; 
	public String jobtitle; 
	public String salary; 
	public String workexperience; 
	public String nextcompany;
	@Override
	public String toString() {
		return "EmployeeProfessional [dateofjoining=" + dateofjoining + ", dateofrelieving=" + dateofrelieving
				+ ", jobtitle=" + jobtitle + ", salary=" + salary + ", workexperience=" + workexperience
				+ ", nextcompany=" + nextcompany + "]";
	} 
}
