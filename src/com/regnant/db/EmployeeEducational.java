package com.regnant.db;

public class EmployeeEducational 
{
	public String ssc;
	public String schoolName;
	public String sscBoard;
	public String sscpercentage;
	public String sscYearOfPassing;
	
	public String intermediate;
	public String collegeName;
	public String intermediateBoard;
	public String intermediatePercentage;
	public String intermediateYearOfPassing;
	
	public String graduate;
	public String collegeName2;
	public String graduateUniversity;
	public String graduatePercentage;
	public String graduateYearOfPassing;
	
	public String masters;
	public String collegeName3;
	public String mastersUniversity;
	public String mastersPercentage;
	public String mastersYearOfPassing;
	
	public String phdCourse;
	public String collegeName4;
	public String phdUniversity;
	public String phdPercentage;
	public String phdYearOfPassing;
	@Override
	public String toString() {
		return "EmployeeEducational [ssc=" + ssc + ", schoolName=" + schoolName + ", sscBoard=" + sscBoard
				+ ", sscpercentage=" + sscpercentage + ", sscYearOfPassing=" + sscYearOfPassing + ", intermediate="
				+ intermediate + ", collegeName=" + collegeName + ", intermediateBoard=" + intermediateBoard
				+ ", intermediatePercentage=" + intermediatePercentage + ", intermediateYearOfPassing="
				+ intermediateYearOfPassing + ", graduate=" + graduate + ", collegeName2=" + collegeName2
				+ ", graduateUniversity=" + graduateUniversity + ", graduatePercentage=" + graduatePercentage
				+ ", graduateYearOfPassing=" + graduateYearOfPassing + ", masters=" + masters + ", collegeName3="
				+ collegeName3 + ", mastersUniversity=" + mastersUniversity + ", mastersPercentage=" + mastersPercentage
				+ ", mastersYearOfPassing=" + mastersYearOfPassing + ", phdCourse=" + phdCourse + ", collegeName4="
				+ collegeName4 + ", phdUniversity=" + phdUniversity + ", phdPercentage=" + phdPercentage
				+ ", phdYearOfPassing=" + phdYearOfPassing + "]";
	}
}
