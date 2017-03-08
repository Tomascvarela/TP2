package TP2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {
Student aStudent = new Student();
Enrollment anEnrollment = new Enrollment();
Commission aCommission = new Commission();
	@Test
	public void addEnrollmentTest() {
		aStudent.addEnrollment(anEnrollment, aCommission);
		assertTrue(aStudent.isEnrolled());
	}
	@Test
	public void deleteEnrollmentTest() {
		aStudent.addEnrollment(anEnrollment, aCommission);
		aStudent.deleteEnrollment(anEnrollment, aCommission);
		assertTrue(!aStudent.isEnrolled());
	}
	@Test
	public void deleteCommissionTest() {
		aStudent.addEnrollment(anEnrollment, aCommission);
		aStudent.deleteCommission(anEnrollment);
		assertTrue(!aStudent.isInCommission());
	}
}
