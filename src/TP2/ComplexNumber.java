package TP2;

public class ComplexNumber {
private int realPart;
private int imaginaryPart;
public ComplexNumber(int realPart, int imaginaryPart){
	this.realPart = realPart;
	this.imaginaryPart = imaginaryPart;
}
public ComplexNumber sum (ComplexNumber aNumber){
	int imaginary = this.imaginaryPart+aNumber.imaginaryPart;
	int real = this.realPart+aNumber.realPart;
	return new ComplexNumber(real, imaginary);
}
public ComplexNumber substract (ComplexNumber aNumber){
	int imaginary = this.imaginaryPart-aNumber.imaginaryPart;
	int real = this.realPart-aNumber.realPart;
	return new ComplexNumber(real, imaginary);
}
public ComplexNumber multiply (ComplexNumber aNumber){
	int imaginary = (this.realPart*aNumber.imaginaryPart())+(this.imaginaryPart*aNumber.realPart());
	int real = (this.realPart*aNumber.realPart)-(this.imaginaryPart-aNumber.imaginaryPart());
	return new ComplexNumber(real, imaginary);
}
public ComplexNumber divide (ComplexNumber aNumber){
	int imaginary = (int) (((this.realPart*aNumber.realPart())+(this.imaginaryPart*aNumber.imaginaryPart()))/(Math.pow(aNumber.realPart(), 2)+Math.pow(aNumber.imaginaryPart(), 2)));
	int real = (int) (((this.imaginaryPart*aNumber.realPart())-(this.realPart*aNumber.imaginaryPart()))/(Math.pow(aNumber.realPart(), 2)+Math.pow(aNumber.imaginaryPart(), 2)));
	return new ComplexNumber(real, imaginary);
}
public int realPart(){
	return realPart;
}
public int imaginaryPart(){
	return imaginaryPart;
}
public double modulus(){
	return Math.sqrt(Math.pow(realPart, 2)+Math.pow(imaginaryPart, 2));
}
public void printNumber(){
	System.out.println(realPart+"+"+imaginaryPart+"i");
}
public ComplexNumber readFromKeyboard(int real, int imaginary){
	return new ComplexNumber(real, imaginary);
}
}
