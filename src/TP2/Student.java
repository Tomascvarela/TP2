package TP2;

public class Student {
private Enrollment enrollment;
private Commission commission;
public Student(){
	enrollment = null;
	commission = null;
}
public void addEnrollment(Enrollment m, Commission com){
	if (enrollment == null) {
		enrollment = m;
		commission = com;
	}
}
public void deleteCommission(Enrollment m){
	if (enrollment !=null && commission != null){
		commission = null;
	}
}
public void deleteEnrollment(Enrollment m, Commission x){
	if (enrollment !=null){
		enrollment = null;
	}
}
public boolean isEnrolled(){
	if (enrollment == null) return false;
	else return true;
}
public boolean isInCommission(){
	if (commission == null) return false;
	else return true;
}
}
