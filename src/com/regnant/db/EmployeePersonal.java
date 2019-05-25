package com.regnant.db;

import java.util.Arrays;

public class EmployeePersonal 
{
   public String employeeId;   
   public String firstname;   
   public String lastname;   
   
   public String dateofbirth;   
   public String gender;   
   public String maritalStatus;   
   
   public String fatherName;   
   public String motherName;   
   public String nationality;

   public String language[];   
   public String languageString;
   public String bloodGroup;   
  
   public String phoneNumber;   
   public String email;   
   public String password;
@Override
public String toString() {
	return "EmployeePersonal [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", maritalStatus=" + maritalStatus
			+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", nationality=" + nationality
			+ ", language=" + Arrays.toString(language) + ", languageString=" + languageString + ", bloodGroup="
			+ bloodGroup + ", phoneNumber=" + phoneNumber + ", email=" + email + ",     password=" + password + "]";
}   
   
}
