package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	static ArrayList<Course> Courses = new ArrayList<Course>();
	
	static ArrayList<Semester> Semesters = new ArrayList<Semester>();
	
	static ArrayList<Section> Sections = new ArrayList<Section>();
	
	static ArrayList<Enrollment> Enrollments = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws PersonException {
		
		//Courses:
		
		UUID Course1ID = UUID.randomUUID();
		UUID Course2ID = UUID.randomUUID();
		UUID Course3ID = UUID.randomUUID();
		
		Course C1 = new Course(Course1ID,"Physics207",4 , eMajor.PHYSICS);
		Course C2 = new Course(Course2ID,"CISC181",3 , eMajor.COMPSI);
		Course C3 = new Course(Course3ID,"CHEM104",4 , eMajor.CHEM);
		
		Courses.add(C1);
		Courses.add(C2);
		Courses.add(C3);
		
		//Semesters
		
		UUID Semester1ID = UUID.randomUUID();
		UUID Semester2ID = UUID.randomUUID();
		
		Date Sem1StartDate = new GregorianCalendar(2017,1,05, 00, 00, 00).getTime();
		Date Sem1EndDate = new GregorianCalendar(2017,4,24, 00, 00, 00).getTime();
		Date Sem2StartDate = new GregorianCalendar(2017,7,23, 00, 00, 00).getTime();
		Date Sem2EndDate = new GregorianCalendar(2017,11,16, 00, 00, 00).getTime();
		
		Semester SpringSemester = new Semester(Semester1ID, Sem1StartDate, Sem1EndDate);
		Semester FallSemester = new Semester(Semester2ID, Sem2StartDate, Sem2EndDate);
		
		Semesters.add(SpringSemester);
		Semesters.add(FallSemester);
		
		//Sections
		
		UUID Section1ID = UUID.randomUUID();
		UUID Section2ID = UUID.randomUUID();
		UUID Section3ID = UUID.randomUUID();
		UUID Section4ID = UUID.randomUUID();
		UUID Section5ID = UUID.randomUUID();
		UUID Section6ID = UUID.randomUUID();
		
		int Room1ID = 101;
		int Room2ID = 102;
		int Room3ID = 103;
		int Room4ID = 204;
		int Room5ID = 205;
		int Room6ID = 206;
		
		
		Section Section1 = new Section(Course1ID, Semester1ID,Section1ID, 101);
		Section Section2 = new Section(Course2ID, Semester1ID,Section2ID, 102);
		Section Section3 = new Section(Course3ID, Semester1ID,Section3ID, 103);
		Section Section4 = new Section(Course1ID, Semester2ID,Section4ID, 204);
		Section Section5 = new Section(Course2ID, Semester2ID,Section5ID, 205);
		Section Section6 = new Section(Course3ID, Semester2ID,Section6ID, 206);
		
		Sections.add(Section1);
		Sections.add(Section2);
		Sections.add(Section3);
		Sections.add(Section4);
		Sections.add(Section5);
		Sections.add(Section6);
		
		ArrayList<Student> Students = new ArrayList<Student>();
		
		Date Student1DOB = new GregorianCalendar(2000,1,21, 00, 00, 00).getTime();
		Date Student2DOB = new GregorianCalendar(2000,1,14, 00, 00, 00).getTime();
		Date Student3DOB = new GregorianCalendar(1999,5,23, 00, 00, 00).getTime();
		Date Student4DOB = new GregorianCalendar(2000,2,10, 00, 00, 00).getTime();
		Date Student5DOB = new GregorianCalendar(1999,11,17, 00, 00, 00).getTime();
		Date Student6DOB = new GregorianCalendar(1999,7,28, 00, 00, 00).getTime();
		Date Student7DOB = new GregorianCalendar(1999,9,19, 00, 00, 00).getTime();
		Date Student8DOB = new GregorianCalendar(1999,5,16, 00, 00, 00).getTime();
		Date Student9DOB = new GregorianCalendar(1999,9,29, 00, 00, 00).getTime();
		Date Student10DOB = new GregorianCalendar(1999,10,15, 00, 00, 00).getTime();
		
		Student Student1 = new Student("Ahmad","Mohammed", "Tamimi", Student1DOB, eMajor.COMPSI, "Delaware, Newark, Christianna Drive, Apt.102", "(346)-754-2753","ATamimi@udel.edu");
		Student Student2 = new Student("Umer","Mohammed", "Farooq", Student2DOB, eMajor.COMPSI, "Delaware, Newark, Christianna Drive, Apt.205", "(654)-764-6543","UFarooq@udel.edu");
		Student Student3 = new Student("George","Anthony", "Smith", Student3DOB, eMajor.COMPSI, "Delaware, Newark, Christianna Drive, Apt.304", "(347)-345-3675","GSmith@udel.edu");
		Student Student4 = new Student("Anthony","Josh", "Stewart", Student4DOB, eMajor.CHEM, "Delaware, Newark, Christianna Drive, Apt.420", "(357)-564-2545","AStewart@udel.edu");
		Student Student5 = new Student("Jessica","Joshua", "Veira", Student5DOB, eMajor.CHEM, "Delaware, Newark, Christianna Drive, Apt.239", "(485)-748-2743","JVeira@udel.edu");
		Student Student6 = new Student("Madison","Tony", "Weiss", Student6DOB, eMajor.CHEM, "Delaware, Newark, Christianna Drive, Apt.543", "(649)-385-6542","MWeiss@udel.edu");
		Student Student7 = new Student("Sama","Carl", "Eid", Student7DOB, eMajor.PHYSICS, "Delaware, Newark, Christianna Drive, Apt.532", "(756)-765-7542","SEid@udel.edu");
		Student Student8 = new Student("Ken","Tyrone", "Strother", Student8DOB, eMajor.PHYSICS, "Delaware, Newark, Christianna Drive, Apt354", "(389)-736-7654","KSrtother@udel.edu");
		Student Student9 = new Student("Keith","Andy", "Blake", Student9DOB, eMajor.PHYSICS, "Delaware, Newark, Christianna Drive, Apt.431", "(398)-368-7432","KBlake@udel.edu");
		Student Student10 = new Student("Elisa","Jonathan", "Cutrona", Student10DOB, eMajor.PHYSICS, "Delaware, Newark, Christianna Drive, Apt.234", "(364)-643-8654","ECutrona@udel.edu");
		
		Students.add(Student1);
		Students.add(Student2);
		Students.add(Student3);
		Students.add(Student4);
		Students.add(Student5);
		Students.add(Student6);
		Students.add(Student7);
		Students.add(Student8);
		Students.add(Student9);
		Students.add(Student10);
		
		//Enrollment:
		//1st Semester:
		//Student 1 enrollment and setting grades for the enrolled courses:
		Enrollment Student1Course1Sem1= new Enrollment(Section1ID, Student1.getStudentID());
		Student1Course1Sem1.setGrade(4.00);
		Enrollment Student1Course2Sem1= new Enrollment(Section2ID, Student1.getStudentID());
		Student1Course2Sem1.setGrade(3.00);
		Enrollment Student1Course3Sem1= new Enrollment(Section3ID, Student1.getStudentID());
		Student1Course3Sem1.setGrade(4.00);
		
		//Student 2 enrollment and setting grades for the enrolled courses:
		Enrollment Student2Course1Sem1= new Enrollment(Section1ID, Student2.getStudentID());
		Student2Course1Sem1.setGrade(3.60);
		Enrollment Student2Course2Sem1= new Enrollment(Section2ID, Student2.getStudentID());
		Student2Course2Sem1.setGrade(2.70);
		Enrollment Student2Course3Sem1= new Enrollment(Section3ID, Student2.getStudentID());
		Student2Course3Sem1.setGrade(3.20);
		
		//Student 3 enrollment and setting grades for the enrolled courses:
		Enrollment Student3Course1Sem1= new Enrollment(Section1ID, Student3.getStudentID());
		Student3Course1Sem1.setGrade(3.20);
		Enrollment Student3Course2Sem1= new Enrollment(Section2ID, Student3.getStudentID());
		Student3Course2Sem1.setGrade(2.40);
		Enrollment Student3Course3Sem1= new Enrollment(Section3ID, Student3.getStudentID());
		Student3Course3Sem1.setGrade(3.60);
				
		//Student 4 enrollment and setting grades for the enrolled courses:
		Enrollment Student4Course1Sem1= new Enrollment(Section1ID, Student4.getStudentID());
		Student4Course1Sem1.setGrade(4.00);
		Enrollment Student4Course2Sem1= new Enrollment(Section2ID, Student4.getStudentID());
		Student4Course2Sem1.setGrade(2.70);
		Enrollment Student4Course3Sem1= new Enrollment(Section3ID, Student4.getStudentID());
		Student4Course3Sem1.setGrade(3.60);
		
		//Student 5 enrollment and setting grades for the enrolled courses:
		Enrollment Student5Course1Sem1= new Enrollment(Section1ID, Student5.getStudentID());
		Student5Course1Sem1.setGrade(3.60);
		Enrollment Student5Course2Sem1= new Enrollment(Section2ID, Student5.getStudentID());
		Student5Course2Sem1.setGrade(2.70);
		Enrollment Student5Course3Sem1= new Enrollment(Section3ID, Student5.getStudentID());
		Student5Course3Sem1.setGrade(3.60);
		
		//Student 6 enrollment and setting grades for the enrolled courses:
		Enrollment Student6Course1Sem1= new Enrollment(Section1ID, Student6.getStudentID());
		Student6Course1Sem1.setGrade(2.80);
		Enrollment Student6Course2Sem1= new Enrollment(Section2ID, Student6.getStudentID());
		Student6Course2Sem1.setGrade(2.10);
		Enrollment Student6Course3Sem1= new Enrollment(Section3ID, Student6.getStudentID());
		Student6Course3Sem1.setGrade(3.20);
				
		//Student 7 enrollment and setting grades for the enrolled courses:
		Enrollment Student7Course1Sem1= new Enrollment(Section1ID, Student7.getStudentID());
		Student7Course1Sem1.setGrade(3.20);
		Enrollment Student7Course2Sem1= new Enrollment(Section2ID, Student7.getStudentID());
		Student7Course2Sem1.setGrade(2.70);
		Enrollment Student7Course3Sem1= new Enrollment(Section3ID, Student7.getStudentID());
		Student7Course3Sem1.setGrade(3.60);
				
		//Student 8 enrollment and setting grades for the enrolled courses:
		Enrollment Student8Course1Sem1= new Enrollment(Section1ID, Student8.getStudentID());
		Student8Course1Sem1.setGrade(3.20);
		Enrollment Student8Course2Sem1= new Enrollment(Section2ID, Student8.getStudentID());
		Student8Course2Sem1.setGrade(2.40);
		Enrollment Student8Course3Sem1= new Enrollment(Section3ID, Student8.getStudentID());
		Student8Course3Sem1.setGrade(4.00);
						
		//Student 9 enrollment and setting grades for the enrolled courses:
		Enrollment Student9Course1Sem1= new Enrollment(Section1ID, Student9.getStudentID());
		Student9Course1Sem1.setGrade(3.60);
		Enrollment Student9Course2Sem1= new Enrollment(Section2ID, Student9.getStudentID());
		Student9Course2Sem1.setGrade(3.00);
		Enrollment Student9Course3Sem1= new Enrollment(Section3ID, Student9.getStudentID());
		Student9Course3Sem1.setGrade(4.00);
				
		//Student 10 enrollment and setting grades for the enrolled courses:
		Enrollment Student10Course1Sem1= new Enrollment(Section1ID, Student10.getStudentID());
		Student10Course1Sem1.setGrade(3.20);
		Enrollment Student10Course2Sem1= new Enrollment(Section2ID, Student10.getStudentID());
		Student10Course2Sem1.setGrade(3.00);
		Enrollment Student10Course3Sem1= new Enrollment(Section3ID, Student10.getStudentID());
		Student10Course3Sem1.setGrade(3.60);
		
		
		//2nd Semester:
		//Student 1 enrollment and setting grades for the enrolled courses:
		Enrollment Student1Course1Sem2= new Enrollment(Section4ID, Student1.getStudentID());
		Student1Course1Sem2.setGrade(4.00);
		Enrollment Student1Course2Sem2= new Enrollment(Section5ID, Student1.getStudentID());
		Student1Course2Sem2.setGrade(3.00);
		Enrollment Student1Course3Sem2= new Enrollment(Section6ID, Student1.getStudentID());
		Student1Course3Sem2.setGrade(4.00);
				
		//Student 2 enrollment and setting grades for the enrolled courses:
		Enrollment Student2Course1Sem2= new Enrollment(Section4ID, Student2.getStudentID());
		Student2Course1Sem2.setGrade(2.80);
		Enrollment Student2Course2Sem2= new Enrollment(Section5ID, Student2.getStudentID());
		Student2Course2Sem2.setGrade(2.10);
		Enrollment Student2Course3Sem2= new Enrollment(Section6ID, Student2.getStudentID());
		Student2Course3Sem2.setGrade(3.60);
				
		//Student 3 enrollment and setting grades for the enrolled courses:
		Enrollment Student3Course1Sem2= new Enrollment(Section4ID, Student3.getStudentID());
		Student3Course1Sem2.setGrade(3.60);
		Enrollment Student3Course2Sem2= new Enrollment(Section5ID, Student3.getStudentID());
		Student3Course2Sem2.setGrade(2.70);
		Enrollment Student3Course3Sem2= new Enrollment(Section6ID, Student3.getStudentID());
		Student3Course3Sem2.setGrade(2.80);
						
		//Student 4 enrollment and setting grades for the enrolled courses:
		Enrollment Student4Course1Sem2= new Enrollment(Section4ID, Student4.getStudentID());
		Student4Course1Sem2.setGrade(3.20);
		Enrollment Student4Course2Sem2= new Enrollment(Section5ID, Student4.getStudentID());
		Student4Course2Sem2.setGrade(2.10);
		Enrollment Student4Course3Sem2= new Enrollment(Section6ID, Student4.getStudentID());
		Student4Course3Sem2.setGrade(4.00);
				
		//Student 5 enrollment and setting grades for the enrolled courses:
		Enrollment Student5Course1Sem2= new Enrollment(Section4ID, Student5.getStudentID());
		Student5Course1Sem2.setGrade(3.20);
		Enrollment Student5Course2Sem2= new Enrollment(Section5ID, Student5.getStudentID());
		Student5Course2Sem2.setGrade(2.40);
		Enrollment Student5Course3Sem2= new Enrollment(Section6ID, Student5.getStudentID());
		Student5Course3Sem2.setGrade(3.60);
				
		//Student 6 enrollment and setting grades for the enrolled courses:
		Enrollment Student6Course1Sem2= new Enrollment(Section4ID, Student6.getStudentID());
		Student6Course1Sem2.setGrade(3.20);
		Enrollment Student6Course2Sem2= new Enrollment(Section5ID, Student6.getStudentID());
		Student6Course2Sem2.setGrade(2.70);
		Enrollment Student6Course3Sem2= new Enrollment(Section6ID, Student6.getStudentID());
		Student6Course3Sem2.setGrade(3.60);
						
		//Student 7 enrollment and setting grades for the enrolled courses:
		Enrollment Student7Course1Sem2= new Enrollment(Section4ID, Student7.getStudentID());
		Student7Course1Sem2.setGrade(2.80);
		Enrollment Student7Course2Sem2= new Enrollment(Section5ID, Student7.getStudentID());
		Student7Course2Sem2.setGrade(2.40);
		Enrollment Student7Course3Sem2= new Enrollment(Section6ID, Student7.getStudentID());
		Student7Course3Sem2.setGrade(4.00);
						
		//Student 8 enrollment and setting grades for the enrolled courses:
		Enrollment Student8Course1Sem2= new Enrollment(Section4ID, Student8.getStudentID());
		Student8Course1Sem2.setGrade(2.40);
		Enrollment Student8Course2Sem2= new Enrollment(Section5ID, Student8.getStudentID());
		Student8Course2Sem2.setGrade(2.10);
		Enrollment Student8Course3Sem2= new Enrollment(Section6ID, Student8.getStudentID());
		Student8Course3Sem2.setGrade(3.20);
								
		//Student 9 enrollment and setting grades for the enrolled courses:
		Enrollment Student9Course1Sem2= new Enrollment(Section4ID, Student9.getStudentID());
		Student9Course1Sem2.setGrade(3.20);
		Enrollment Student9Course2Sem2= new Enrollment(Section5ID, Student9.getStudentID());
		Student9Course2Sem2.setGrade(2.10);
		Enrollment Student9Course3Sem2= new Enrollment(Section6ID, Student9.getStudentID());
		Student9Course3Sem2.setGrade(3.60);
						
		//Student 10 enrollment and setting grades for the enrolled courses:
		Enrollment Student10Course1Sem2= new Enrollment(Section4ID, Student10.getStudentID());
		Student10Course1Sem2.setGrade(3.60);
		Enrollment Student10Course2Sem2= new Enrollment(Section5ID, Student10.getStudentID());
		Student10Course2Sem2.setGrade(2.10);
		Enrollment Student10Course3Sem2= new Enrollment(Section6ID, Student10.getStudentID());
		Student10Course3Sem2.setGrade(4.00);
		
		//Adding all the enrollments:
		
		Enrollments.add(Student1Course1Sem1);
		Enrollments.add(Student1Course2Sem1);
		Enrollments.add(Student1Course3Sem1);
		Enrollments.add(Student2Course1Sem1);
		Enrollments.add(Student2Course2Sem1);
		Enrollments.add(Student2Course3Sem1);
		Enrollments.add(Student3Course1Sem1);
		Enrollments.add(Student3Course2Sem1);
		Enrollments.add(Student3Course3Sem1);
		Enrollments.add(Student4Course1Sem1);
		Enrollments.add(Student4Course2Sem1);
		Enrollments.add(Student4Course3Sem1);
		Enrollments.add(Student5Course1Sem1);
		Enrollments.add(Student5Course2Sem1);
		Enrollments.add(Student5Course3Sem1);
		Enrollments.add(Student6Course1Sem1);
		Enrollments.add(Student6Course2Sem1);
		Enrollments.add(Student6Course3Sem1);
		Enrollments.add(Student7Course1Sem1);
		Enrollments.add(Student7Course2Sem1);
		Enrollments.add(Student7Course3Sem1);
		Enrollments.add(Student8Course1Sem1);
		Enrollments.add(Student8Course2Sem1);
		Enrollments.add(Student8Course3Sem1);
		Enrollments.add(Student9Course1Sem1);
		Enrollments.add(Student9Course2Sem1);
		Enrollments.add(Student9Course3Sem1);
		Enrollments.add(Student10Course1Sem1);
		Enrollments.add(Student10Course2Sem1);
		Enrollments.add(Student10Course3Sem1);
		Enrollments.add(Student1Course1Sem2);
		Enrollments.add(Student1Course2Sem2);
		Enrollments.add(Student1Course3Sem2);
		Enrollments.add(Student2Course1Sem2);
		Enrollments.add(Student2Course2Sem2);
		Enrollments.add(Student2Course3Sem2);
		Enrollments.add(Student3Course1Sem2);
		Enrollments.add(Student3Course2Sem2);
		Enrollments.add(Student3Course3Sem2);
		Enrollments.add(Student4Course1Sem2);
		Enrollments.add(Student4Course2Sem2);
		Enrollments.add(Student4Course3Sem2);
		Enrollments.add(Student5Course1Sem2);
		Enrollments.add(Student5Course2Sem2);
		Enrollments.add(Student5Course3Sem2);
		Enrollments.add(Student6Course1Sem2);
		Enrollments.add(Student6Course2Sem2);
		Enrollments.add(Student6Course3Sem2);
		Enrollments.add(Student7Course1Sem2);
		Enrollments.add(Student7Course2Sem2);
		Enrollments.add(Student7Course3Sem2);
		Enrollments.add(Student8Course1Sem2);
		Enrollments.add(Student8Course2Sem2);
		Enrollments.add(Student8Course3Sem2);
		Enrollments.add(Student9Course1Sem2);
		Enrollments.add(Student9Course2Sem2);
		Enrollments.add(Student9Course3Sem2);
		Enrollments.add(Student10Course1Sem2);
		Enrollments.add(Student10Course2Sem2);
		Enrollments.add(Student10Course3Sem2);	
		
	}
	
	int totalGradePointsOfCourses = 2*(Courses.get(0).getGradePoints() + Courses.get(1).getGradePoints() + Courses.get(2).getGradePoints()); //This number is constant since all the students are taking the same courses, there is a 2* because the students are taking the same course twice, once in the first semester and once in the second semester.
	
	//Calculating the GPA for each Student tests:

	@Test
	public void testStudent1GPA() {
		//Student 1 GPA:
		double totalGradePointsAcquiredStudent1 = Enrollments.get(0).getGrade() + Enrollments.get(1).getGrade() + Enrollments.get(2).getGrade() + Enrollments.get(30).getGrade() + Enrollments.get(31).getGrade() + Enrollments.get(32).getGrade();
		double ExpectedGPAStudent1 = 4.00;
		double CalculatedGPAStudent1 = (double) 4 * totalGradePointsAcquiredStudent1 / totalGradePointsOfCourses;
		
		assertEquals(ExpectedGPAStudent1, CalculatedGPAStudent1, 0.01); //Correct, expected GPA = calculated GPA for student 1.
	}
	
	@Test 
	public void testStudent2GPA() {
		
		//Student 2 GPA:
		double totalGradePointsAcquiredStudent2 = Enrollments.get(3).getGrade() + Enrollments.get(4).getGrade() + Enrollments.get(5).getGrade() + Enrollments.get(33).getGrade() + Enrollments.get(34).getGrade() + Enrollments.get(35).getGrade();
		double ExpectedGPAStudent2 = 3.27;
		double CalculatedGPAStudent2 = (double) 4 * totalGradePointsAcquiredStudent2 / totalGradePointsOfCourses;
				
		assertEquals(ExpectedGPAStudent2, CalculatedGPAStudent2, 0.01); //Correct, expected GPA = calculated GPA for student 2.
		
	}
		
	@Test
	public void testStudent3GPA() {
		//Student 3 GPA:
		double totalGradePointsAcquiredStudent3 = Enrollments.get(6).getGrade() + Enrollments.get(7).getGrade() + Enrollments.get(8).getGrade() + Enrollments.get(36).getGrade() + Enrollments.get(37).getGrade() + Enrollments.get(38).getGrade();
		double ExpectedGPAStudent3 = 3.33;
		double CalculatedGPAStudent3 = (double) 4 * totalGradePointsAcquiredStudent3 / totalGradePointsOfCourses;
				
		assertEquals(ExpectedGPAStudent3, CalculatedGPAStudent3, 0.01); //Correct, expected GPA = calculated GPA for student 3.
	}
	
	@Test
	public void testStudent4GPA() {
		//Student 4 GPA:
		double totalGradePointsAcquiredStudent4 = Enrollments.get(9).getGrade() + Enrollments.get(10).getGrade() + Enrollments.get(11).getGrade() + Enrollments.get(39).getGrade() + Enrollments.get(40).getGrade() + Enrollments.get(41).getGrade();
		double ExpectedGPAStudent4 = 3.56;
		double CalculatedGPAStudent4 = (double) 4 * totalGradePointsAcquiredStudent4 / totalGradePointsOfCourses;
						
		assertEquals(ExpectedGPAStudent4, CalculatedGPAStudent4, 0.01); //Correct, expected GPA = calculated GPA for student 4.
	}
	
	@Test
	public void testStudent5GPA() {
		//Student 5 GPA:
		double totalGradePointsAcquiredStudent5 = Enrollments.get(12).getGrade() + Enrollments.get(13).getGrade() + Enrollments.get(14).getGrade() + Enrollments.get(42).getGrade() + Enrollments.get(43).getGrade() + Enrollments.get(44).getGrade();
		double ExpectedGPAStudent5 = 3.47;
		double CalculatedGPAStudent5 = (double) 4 * totalGradePointsAcquiredStudent5 / totalGradePointsOfCourses;
						
		assertEquals(ExpectedGPAStudent5, CalculatedGPAStudent5, 0.01); //Correct, expected GPA = calculated GPA for student 5.
	}
	
	@Test
	public void testStudent6GPA() {
		//Student 6 GPA:
		double totalGradePointsAcquiredStudent6 = Enrollments.get(15).getGrade() + Enrollments.get(16).getGrade() + Enrollments.get(17).getGrade() + Enrollments.get(45).getGrade() + Enrollments.get(46).getGrade() + Enrollments.get(47).getGrade();
		double ExpectedGPAStudent6 = 3.20;
		double CalculatedGPAStudent6 = (double) 4 * totalGradePointsAcquiredStudent6 / totalGradePointsOfCourses;
		
		assertEquals(ExpectedGPAStudent6, CalculatedGPAStudent6, 0.01); //Correct, expected GPA = calculated GPA for student 6.
	}
	
	@Test 
	public void testStudent7GPA() {
		
		//Student 7 GPA:
		double totalGradePointsAcquiredStudent7 = Enrollments.get(18).getGrade() + Enrollments.get(19).getGrade() + Enrollments.get(20).getGrade() + Enrollments.get(48).getGrade() + Enrollments.get(49).getGrade() + Enrollments.get(50).getGrade();
		double ExpectedGPAStudent7 = 3.40;
		double CalculatedGPAStudent7 = (double) 4 * totalGradePointsAcquiredStudent7 / totalGradePointsOfCourses;
				
		assertEquals(ExpectedGPAStudent7, CalculatedGPAStudent7, 0.01); //Correct, expected GPA = calculated GPA for student 7.
		
	}
		
	@Test
	public void testStudent8GPA() {
		//Student 8 GPA:
		double totalGradePointsAcquiredStudent8 = Enrollments.get(21).getGrade() + Enrollments.get(22).getGrade() + Enrollments.get(23).getGrade() + Enrollments.get(51).getGrade() + Enrollments.get(52).getGrade() + Enrollments.get(53).getGrade();
		double ExpectedGPAStudent8 = 3.15;
		double CalculatedGPAStudent8 = (double) 4 * totalGradePointsAcquiredStudent8 / totalGradePointsOfCourses;
				
		assertEquals(ExpectedGPAStudent8, CalculatedGPAStudent8, 0.01); //Correct, expected GPA = calculated GPA for student 8.
	}
	
	@Test
	public void testStudent9GPA() {
		//Student 9 GPA:
		double totalGradePointsAcquiredStudent9 = Enrollments.get(24).getGrade() + Enrollments.get(25).getGrade() + Enrollments.get(26).getGrade() + Enrollments.get(54).getGrade() + Enrollments.get(55).getGrade() + Enrollments.get(56).getGrade();
		double ExpectedGPAStudent9 = 3.55;
		double CalculatedGPAStudent9 = (double) 4 * totalGradePointsAcquiredStudent9 / totalGradePointsOfCourses;
						
		assertEquals(ExpectedGPAStudent9, CalculatedGPAStudent9, 0.01); //Correct, expected GPA = calculated GPA for student 9.
	}
	
	@Test
	public void testStudent10GPA() {
		//Student 10 GPA:
		double totalGradePointsAcquiredStudent10 = Enrollments.get(27).getGrade() + Enrollments.get(28).getGrade() + Enrollments.get(29).getGrade() + Enrollments.get(57).getGrade() + Enrollments.get(58).getGrade() + Enrollments.get(59).getGrade();
		double ExpectedGPAStudent10 = 3.55;
		double CalculatedGPAStudent10 = (double) 4 * totalGradePointsAcquiredStudent10 / totalGradePointsOfCourses;
						
		assertEquals(ExpectedGPAStudent10, CalculatedGPAStudent10, 0.01); //Correct, expected GPA = calculated GPA for student 10.
	}
	
	//Tests for calculating the average grade for each course:
	//Note that I will first the average gradepoint for the course obtained by all the sutdents in the course and then divide it by the gradepoint of the actual course and multiply it by 100 to get a percentage.
	//Course 1:
	@Test
	public void testAverageGradeCourse1() {
		int GradePointCourse1 = Courses.get(0).getGradePoints();
		double totalGradePointsObtainedByStudentsCourse1 = 0;
		int count = 0;
		for (int i = 0; i<20; i++) {
			totalGradePointsObtainedByStudentsCourse1 += Enrollments.get(i*3).getGrade();
			count += 1;
		}
		
		double CalculatedAverageGradeCourse1 = totalGradePointsObtainedByStudentsCourse1 * 100 / (GradePointCourse1 * count);
		double ExpectedAverageGradeCourse1 = 83.00;
		
		assertEquals(ExpectedAverageGradeCourse1, CalculatedAverageGradeCourse1, 0.01); //Correct, expected average grade for course 1 = calculated average grade for course 1.
	}
	
	//Course 2:
	@Test
	public void testAverageGradeCourse2() {
		int GradePointCourse2 = Courses.get(1).getGradePoints();
		double totalGradePointsObtainedByStudentsCourse2 = 0;
		int count = 0;
		for (int i = 0; i<20; i++) {
			totalGradePointsObtainedByStudentsCourse2 += Enrollments.get(i*3 +1).getGrade();
			count += 1;
		}
			
		double CalculatedAverageGradeCourse2 = totalGradePointsObtainedByStudentsCourse2 * 100 / (GradePointCourse2 * count);
		double ExpectedAverageGradeCourse2 = 84.00;
			
		assertEquals(ExpectedAverageGradeCourse2, CalculatedAverageGradeCourse2, 0.01); //Correct, expected average grade for course 1 = calculated average grade for course 1.
	}
	
	//Course 3:
	@Test
	public void testAverageGradeCourse3() {
		int GradePointCourse3 = Courses.get(2).getGradePoints();
		double totalGradePointsObtainedByStudentsCourse3 = 0;
		int count = 0;
		for (int i = 0; i<20; i++) {
			totalGradePointsObtainedByStudentsCourse3 += Enrollments.get(i*3 +2).getGrade();
			count += 1;
		}
		
		double CalculatedAverageGradeCourse3 = totalGradePointsObtainedByStudentsCourse3 * 100 / (GradePointCourse3 * count);
		double ExpectedAverageGradeCourse3 = 91.00;
		
		assertEquals(ExpectedAverageGradeCourse3, CalculatedAverageGradeCourse3, 0.01); //Correct, expected average grade for course 1 = calculated average grade for course 1.
	}
		
	
}