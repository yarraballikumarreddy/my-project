package com.regnant.db;

public class Test
{
   public static void main(String []args)
   {
	   CRUDOperations.searchEmployeeProfessional("12353");
	   EmployeeEducational ee=new EmployeeEducational();
	   if (ee.masters==null)
	  {
		  System.out.println(ee.masters+" is null");
	  }
	  System.out.println(ee.masters);
   }
}
