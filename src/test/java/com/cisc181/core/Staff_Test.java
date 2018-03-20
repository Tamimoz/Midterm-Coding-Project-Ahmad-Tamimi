package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> StaffList = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws PersonException {
		
		Date Date1 = new GregorianCalendar(2000,3,17, 00, 00, 00).getTime();
		Date Hire1 = new GregorianCalendar(2018,1,7, 00, 00, 00).getTime();
		Date Date2 = new GregorianCalendar(1987,7,28, 00, 00, 00).getTime();
		Date Hire2 = new GregorianCalendar(2006,4,24, 00, 00, 00).getTime();
		Date Date3 = new GregorianCalendar(1990,9,6, 00, 00, 00).getTime();
		Date Hire3 = new GregorianCalendar(2010,5,13, 00, 00, 00).getTime();
		Date Date4 = new GregorianCalendar(1994,5,25, 00, 00, 00).getTime();
		Date Hire4 = new GregorianCalendar(2012,3,12, 00, 00, 00).getTime();
		Date Date5 = new GregorianCalendar(1973,3,15, 00, 00, 00).getTime();
		Date Hire5 = new GregorianCalendar(1995,7,29, 00, 00, 00).getTime();
		
		
		Staff s1 = new Staff("Steve", "Nicholas", "Anderson", Date1, "Delaware, Newark, Main Street, Apt.102", "(332)-594-2844","SAnderson@udel.edu","9:00 AM - 5:00 PM", 1, 70000.00, Hire1, eTitle.MR);
		Staff s2 = new Staff("Jessica", "Andrew", "Weiss", Date2, "Delaware, Newark, Main Street, Apt.103", "(345)-839-3478","JWeiss@udel.edu","9:00 AM - 5:00 PM", 1, 70000.00, Hire2, eTitle.MRS);
		Staff s3 = new Staff("Josh", "Thomas", "Smith", Date3, "Delaware, Newark, Main Street, Apt.202", "(273)-283-8746","JSmith@udel.edu","10:00 AM - 7:00 PM", 2, 90000.00, Hire3, eTitle.MR);
		Staff s4 = new Staff("Zach", "Tyrone", "Harris", Date4, "Delaware, Newark, Main Street, Apt.205", "(239)-384-9348","ZHariss@udel.edu","9:00 AM - 6:00 PM", 2, 95000.00, Hire4, eTitle.MR);
		Staff s5 = new Staff("Cara", "Federick", "Veira", Date5, "Delaware, Newark, Main Street, Apt.304", "(835)-349-2438","CVeira@udel.edu","10:00 AM - 7:00 PM", 3, 125000.00, Hire5, eTitle.MRS);
		
		StaffList.add(s1);
		StaffList.add(s2);
		StaffList.add(s3);
		StaffList.add(s4);
		StaffList.add(s5);
	}
	
	@Test 
	public void testAverageSalary() {
		int count =0;
		double sum = 0;
		for(Staff c : StaffList) {
			sum += c.getSalary();
			count += 1;
		}
		double Average = sum/count;
		
		double ExpectedAverage = 90000.00;
		
		assertEquals(Average, ExpectedAverage, 0.01);
	}	
	
	@Test (expected = PersonException.class)//Test to see if the PersonException is thrown for putting a DOB of 100 years older than today's date
	public void testForPersonException_AgeMoreThan100() throws PersonException{
		Date Faulty_Date = new GregorianCalendar(1900,3,17, 00, 00, 00).getTime();
		StaffList.get(0).setDOB(Faulty_Date);

	}
	
	@Test (expected = PersonException.class)//Test to see if the PersonException is thrown for putting a phone number that is not in the form (###)-###-####.
	public void testForPersonException_InvalidPhoneNumber() throws PersonException{
		String invalid_phone_number = "(123)456-789";
		StaffList.get(0).setPhone(invalid_phone_number);
	}

}
